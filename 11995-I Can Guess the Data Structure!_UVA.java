
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;


public class Main {
    //        public static void sort(int[] arr, int l, int r) { //O(nlogn)
//        if(l > r) return;
//        int mid = l + (r - l)/2; // = (l+r)/2
//        sort(arr, l, mid - 1);
//        sort(arr, mid, r);
//     merge(arr, l, mid, r);
//    }
//
//        public static void merge(int[] arr, int l, int mid, int r) { //O(n)
//        int size1 = l + mid;
//        int size2 = r - mid;
//        int[] a = new int[size1];
//        int[] b = new int[size2];
//        int k = l;
//        for (int i = 0; i < size1; i++) {
//            a[i] = arr[k++];
//        }
//        for (int i = 0; i < size2; i++) {
//            b[i] = arr[k++];
//        }
//        k = l;
//        int i = 0, j = 0;
//    }
//    static int [][]grid;
    public static int id;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        Thread.sleep(3000);
        while(br.ready()) {
            Stack<Integer> S= new Stack<>();
            PriorityQueue<Integer> PQ= new PriorityQueue<>((a,b)->b-a);
            Queue<Integer> Q= new LinkedList<>();
            boolean Stack=true, Priority=true, Queue= true;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            for (int i = 0; i < N; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());
                if (a == 1) {
                    S.add(b);
                    PQ.add(b);
                    Q.add(b);
                } else {
                    if (S.isEmpty() || S.pop() != b)
                        Stack = false;

                    if (PQ.isEmpty() || PQ.remove() != b)
                        Priority = false;
                    if (Q.isEmpty() || Q.remove() != b)
                        Queue = false;
                }
            }
            if ((Stack && Priority) || (Stack && Queue) || (Priority && Queue)) {
                pw.println("not sure");
            } else if (Stack) {
                pw.println("stack");
            } else if (Priority) {
                pw.println("priority queue");
            } else if (Queue) {
                pw.println("queue");
            } else
                pw.println("impossible");
        }
        pw.flush();
    }
}


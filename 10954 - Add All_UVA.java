
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

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb= new StringBuilder();
        while(true) {
            PriorityQueue<Integer>PQ= new PriorityQueue<>();
            StringTokenizer st= new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if(N==0){
                break;
            }else{
                StringTokenizer st1= new StringTokenizer(br.readLine());
                for(int i=0;i<N;i++){
                    PQ.add(Integer.parseInt(st1.nextToken()));
                }
                int sum=0;
                while(PQ.size()>1){
                    int x=PQ.remove();
                    int y=PQ.remove();
                    sum+=x+y;
                    PQ.add(x+y);
                }
                pw.println(sum);
            }
        }
        pw.flush();
    }
}

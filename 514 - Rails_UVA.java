
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
        StringBuilder sb = new StringBuilder();
        TreeSet<String> Groot = new TreeSet();
        while (br.ready()) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                break;
            }
            while (true) {
                ArrayList<Integer> end = new ArrayList<>();
                String[] s = br.readLine().split(" ");
                for (int i = 0; i < s.length; i++) {
                    end.add(Integer.parseInt(s[i]));
                }
                if (end.get(0) == 0) {
                    break;
                }
                Stack<Integer> pancakes = new Stack();
                int x=0;
                for (int i = 1; i <= end.size(); i++) {
                    pancakes.push(i);
                    while(!pancakes.isEmpty()&&pancakes.peek()==end.get(x)&&x<=end.size()){
                        pancakes.pop();
                        x++;
                    }
                } if(pancakes.isEmpty()){
                    pw.println("Yes");
                }else {
                    pw.println("No");
                }
            }
            pw.println();
        }
        pw.flush();
    }
}







import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            boolean br = true;
            while (br) {
                Stack<Integer> stack = new Stack<Integer>();
                int j = 0;
                for (int i = 0; i < N; i++) {
                    int x = sc.nextInt();
                    if (x == 0) {
                        br = false;
                        break;
                    }
                    while (j < N && j != x) {
                        if (stack.size() > 0 && stack.peek() == x) {
                            break;
                        }
                        j++;
                        stack.push(j);
                    }
                    if (stack.peek() == x) {
                        stack.pop();
                    }
                }
                if (br) {
                    if (stack.size() == 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
            System.out.println();
        }
    }
}
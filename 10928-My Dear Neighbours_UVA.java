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
    public static ArrayList<Integer> [] arrlist;
    public static int [] arr;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        while(N --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            arr = new int[P];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<P;i++){
                st = new StringTokenizer(br.readLine());
                arr[i]=st.countTokens();
                min = Math.min(min, arr[i]);
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<arr.length;j++) {
                if (arr[j] == min) {
                    sb.append(j + 1 + " ");
                }
            }
            pw.println(sb.toString().trim());
            if(N>0){
                br.readLine();
            }
        }
        pw.flush();
    }
}

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
        Thread.sleep(3000);
        while(br.ready()) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            String s = st.nextToken();
            String x=st.nextToken();
            int []arr= new int[s.length()];
            int z=0;
            int i=0;
            for(;i< s.length();i++){
                boolean flag=false;
                for(int j=z;j<x.length();j++){
                    if(s.charAt(i)==x.charAt(j)){
                        arr[i]=j;
                        z=j+1;
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(i<s.length()){
                pw.println("No");
            }else{
                pw.println("Yes");
            }
        }
        pw.flush();
    }
}
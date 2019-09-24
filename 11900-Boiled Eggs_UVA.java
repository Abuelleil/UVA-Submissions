
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(st.nextToken());
        int x=0;
        //Thread.sleep(3000);
        while (t-- > 0) {
            StringTokenizer st1= new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st1.nextToken());
            int p= Integer.parseInt(st1.nextToken());
            int q=Integer.parseInt(st1.nextToken());
            int [] arr= new int[n];
            StringTokenizer st2= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st2.nextToken());
            }
            int sum=0;
            int counter=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]+sum<=q&&counter<p){
                     sum+=arr[i];
                     counter++;
                }
            }
            x++;
            pw.println("Case "+x+": "+counter);
        }
        pw.flush();
    }
}
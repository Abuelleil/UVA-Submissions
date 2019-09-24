
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;


public class Main {
    //    public static void sort(int[] arr, int l, int r) { //O(nlogn)
//        if(l > r) return;
//        int mid = l + (r - l)/2; // = (l+r)/2
//        sort(arr, l, mid - 1);
//        sort(arr, mid, r);
    // merge(arr, l, mid, r);
    //}

    //   // public static void merge(int[] arr, int l, int mid, int r) { //O(n)
//     //   int size1 = l + mid;
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
//     static int N,M;
//     static int [][]grid;
    static Integer [][][]memo;
    static int N;
    static int [][] dimensions;
    static int Ai;
    static int Aj;
    static long dp(int ind, int row, int column){
        long ans=Long.MAX_VALUE;
        if(ind==N){
            return 0;
        }if(memo[ind][row][column]!=null){
            return memo[ind][row][column];
        }
        for(int i=0; i<N-1;i++){
            ans=Math.min(ans,dimensions[i][0]*dimensions[i+1][1]+dp(ind+1,dimensions[ind+1][0],dimensions[ind+1][1]));
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st= new StringTokenizer(br.readLine());
        while(true) {
            N=Integer.parseInt(st.nextToken());
            if(N==0) break;
            for (int i = 0; i < N; i++) {
                long ans=0;
                dimensions = new int[N+5][2];
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                Ai = Integer.parseInt(st1.nextToken());
                Aj = Integer.parseInt(st1.nextToken());
                dimensions[i][0] = Ai;
                dimensions[i][1] = Aj;
                ans=dp(0,dimensions[i][0], dimensions[i][1]);
            }
        }
        pw.flush();
    }
}

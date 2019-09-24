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
    static Integer [][] memo;
    static int []P;
    static int []W;
    static int N;
    static int [] MW;
    static int dp(int ind, int remainW){
        if(ind==N) return 0;
        if(memo[ind][remainW]!=null) return memo[ind][remainW];
        int Leave= dp(ind+1,remainW);
        int take=0;
        if(W[ind]<=remainW) take= P[ind]+ dp(ind+1,remainW-W[ind]);
         return  memo[ind][remainW]=Math.max(take,Leave);

    }
    public static void main(String[] args) throws Exception {
        int T;
        int G;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
//        StringTokenizer st = new StringTokenizer(br.readLine());
        T =Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            N=Integer.parseInt(br.readLine());
            P=new int[N];
            W= new int[N];
            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                P[j]=Integer.parseInt(st.nextToken());
                W[j]=Integer.parseInt(st.nextToken());
            }
            G=Integer.parseInt(br.readLine());
            MW=new int[G];
            long ans=0;
            for(int z=0;z<G;z++){
                MW[z]=Integer.parseInt(br.readLine());
                memo= new Integer[N][MW[z]+1];
                ans+=dp(0,MW[z]);
            }
            pw.println(ans);
            }
            pw.flush();
        }
}
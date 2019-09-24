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
    static Integer [][]memo;
    static int M;
    static int N;
    static int K;
    static int [] list;
    static int dp(int ind, int sum){
        if(ind==N){
            if(sum==0){
                return 1;
            }
            return 0;
        }
        int curr=list[ind];
        if(memo[ind][sum]!=null){
            return (memo[ind][sum]);
        }
        int ans=dp(ind+1,((sum+curr)%K+K)%K) | dp(ind+1,((sum-curr)%K+K)%K);
        return memo[ind][sum]=ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        M=Integer.parseInt(st.nextToken());
        for(int i=0;i<M;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            N=Integer.parseInt(st1.nextToken());
            K=Integer.parseInt(st1.nextToken());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            list= new int[N];
            for(int j=0; j<N;j++) {
                int Q = Integer.parseInt(st2.nextToken());
                list[j]=Q;
            }
            memo = new Integer[N + 5][K];
            if(dp(0,0)==1){
                pw.println("Divisible");
            }else{
                pw.println("Not divisible");
            }
        }pw.flush();
    }
}

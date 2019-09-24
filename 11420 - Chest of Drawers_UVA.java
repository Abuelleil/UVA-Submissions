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
    static in N;
    static int S;
    static Long [][][] memo;
    static int counter;
    static boolean locked;
    static int pre;
    static int dp(int ind, int locked, int pre) {
        if(ind==N) {
            if(locked == S)
                return 1;
            return 0;
        }if(locked > S)
            return 0;
        if(memo[ind][locked][pre] != null) return memo[ind][locked][pre];
        int ans = 0;
        if(pre == 1){
            ans += dp(ind+1,locked+1,1)+dp(ind+1,locked,0);
        }else{
            ans += dp(ind+1,locked,1)+dp(ind+1,locked,0);
        }
        return memo[ind][locked][pre]=ans;

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());
            S=Integer.parseInt(st.nextToken());
            long ans=0;
            if(N == -1){
                break;
            }else{
                memo = new Integer[N + 5][S + 5][2];
                ans+=dp(0,0,1);
            }
            pw.println(ans);
        }
        pw.flush();
    }
}




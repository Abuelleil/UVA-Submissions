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
    static int coin10;
    static int coin5;
    static int coin1;
    static long numCoke;
    static Long [][][] memo;

    static long dp(int ind,int ten, int five) {
        long ans = Long.MAX_VALUE;
        long one = totalmoney(coin1, coin5, coin10) - ten * 10 - five * 5 - ind * 8;
        if (ind == numCoke) return 0;
        else {
            if (memo[ind][ten][five] != null) return memo[ind][ten][five];
            if (ten >= 1) {
                one += 2;
                ans = Math.min(ans,1 + dp(ind + 1, ten - 1, five));
            }
            if (five >= 2) {
                one += 2;
                ans = Math.min(ans,2 + dp(ind + 1, ten, five - 2));
            }
            if(ten>=1 && one>=3){
                one-=3;
                ans = Math.min(ans,4 + dp(ind + 1, ten-1, five+1));
            }
            if (five >= 1 && one >= 3) {
                one -= 3;
                ans = Math.min(ans,4 + dp(ind + 1, ten, five - 1));
            }
            if (one >= 8) {
                one -= 8;
                ans = Math.min(ans, 8 + dp(ind + 1, ten, five));

            }
        }
        return memo[ind][ten][five] = ans;
    }

        static long totalmoney ( long coinone, long coinfive, long cointen){
            return coin1 + (coin5 * 5) + (coin10 * 10);
        }
        public static void main(String[] args) throws Exception{
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Integer.parseInt(st.nextToken());
            for (int i = 0; i < x; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                numCoke = Integer.parseInt(st1.nextToken());
                coin1 = Integer.parseInt(st1.nextToken());
                coin5 = Integer.parseInt(st1.nextToken());
                coin10 = Integer.parseInt(st1.nextToken());
                memo = new Long [200][200][200];
                pw.println(dp(0,coin10,coin5));
            }
            pw.flush();
        }
    }
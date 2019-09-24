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
    static int T;
    static int N;
    static int M;
    static double S;
    static int [][] schedule;
    static int dp(int ind, int remainder) {
        int ans=Integer.MIN_VALUE;
        if(ind==N) return 0;
        if(memo[ind][remainder] != null) return memo[ind][remainder];
        for(int i=0;i<M;i++){
            if(remainder-(i+1)>=0 &&(schedule[ind][i]>4)){
                ans=Math.max(ans,schedule[ind][i]+dp(ind+1,remainder-(i+1)));
            }
        }
        return memo[ind][remainder]=ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());
            M=Integer.parseInt(st.nextToken());
            schedule= new int [N][M];
            for(int j=0;j<N;j++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for(int z=0;z<M;z++){
                    schedule[j][z]= Integer.parseInt(st1.nextToken());
                }
            }
//            for(int k=0;k<N;k++){
//                pw.println(Arrays.toString(schedule[i]));
//            }
            memo=new Integer[N][M+1];
            S=dp(0,M);
            if(S<0){
                pw.println("Peter, you shouldn't have played billiard that much.");
            }else {
                S = S / N;
                pw.printf("Maximal possible average mark - %.2f.\n",S);
            }
        }
        pw.flush();
    }
}

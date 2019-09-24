
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
    static int T;
    static  int W;
    static int N;
    static int D;
    static int V;
    static int[] depth;
    static int[] gold;
    static boolean [] taken;
    static int dp(int ind,int time){
        if(ind==N) return 0;
        if(memo[ind][time]!=null) return memo[ind][time];
        int ans= Integer.MIN_VALUE;
        int timedescent=W*depth[ind];
        int timeascent=(2*W)*depth[ind];
        if(time-(timeascent+timedescent)>=0){
            ans=Math.max(ans,gold[ind]+dp(ind+1, time-((timeascent+timedescent))));
        }
        ans=Math.max(ans,dp(ind+1, time));
        return memo[ind][time]=ans;
    }
    static void print(int ind,int time){
        if(ind==N) return;
        int optimal=dp(ind,time);
        int take=-1;
        int leave=0;
        int timedescent=W*depth[ind];
        int timeascent=(2*W)*depth[ind];
        if(time-(timeascent+timedescent)>=0){
            take=gold[ind]+dp(ind+1, time-(timeascent+timedescent));
        }
         leave=dp(ind+1, time);
        if(optimal==take){
         taken[ind]=true;
         print(ind+1,time-(timeascent+timedescent));
        }else{
            print(ind+1,time);
        }
        return;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int count=0;
        Thread.sleep(3000);
        while(br.ready()) {
            if(count>0){
               br.readLine();
               pw.println();
            }
            count++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            T = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st1.nextToken());
            depth = new int[N];
            gold = new int[N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                D = Integer.parseInt(st2.nextToken());
                depth[i] = D;
                V = Integer.parseInt(st2.nextToken());
                gold[i] = V;
            }
            memo= new Integer[N][T+1];
            taken=new boolean[N];
            pw.println(dp(0,T));
            int counter=0;
            print(0,T);
            StringBuilder sb= new StringBuilder();
            for(int k=0;k<taken.length;k++){
                if(taken[k]==true){
                    sb.append((depth[k]+" "+gold[k])+"\n");
                    counter++;
                }
            }
            pw.println(counter);
            pw.print(sb);
        }
        pw.flush();
    }
}

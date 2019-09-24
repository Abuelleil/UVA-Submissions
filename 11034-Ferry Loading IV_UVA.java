
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
    public static int id;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        Thread.sleep(3000);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        while(N>0) {
            Queue<Integer>Right= new LinkedList<>();
            Queue<Integer>Left= new LinkedList<>();
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int l=Integer.parseInt(st1.nextToken());
            int m= Integer.parseInt(st1.nextToken());
            l=l*100;
            for(int i=0;i<m;i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int len = Integer.parseInt(st2.nextToken());
                if (st2.nextToken().equals("left")) {
                    Left.add(len);
                } else {
                    Right.add(len);
                }
            }
                int ans=0;
                while(!Left.isEmpty()||!Right.isEmpty()){
                    ans++;
                    int remLen=l;
                    while(!Left.isEmpty()&& remLen-Left.peek()>=0){
                        remLen-=Left.remove();
                    }
                    if(!Left.isEmpty()||!Right.isEmpty()){
                        ans++;
                    }
                    remLen = l;
                    while(!Right.isEmpty()&& remLen-Right.peek()>=0){
                        remLen-=Right.remove();
                    }
                }
            pw.println(ans);
               N--;
            }
        pw.flush();
        }

    }
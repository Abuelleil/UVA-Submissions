
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
        StringBuilder sb = new StringBuilder();
        int counter=1;
        while(true){
           String s=br.readLine();
           if(s.equals("end")) break;
           ArrayList<Integer> stack= new ArrayList<Integer>();
           char[]c= s.toCharArray();

           for(int j=0;j<c.length;j++) {
            int index=-1;
            int min=100;
            int cur=c[j]-'A';
            for(int i=0; i<stack.size();i++){
                int diff=stack.get(i)-cur;
                if(diff>=0 && diff<min){
                    min=diff;
                    index=i;
                }
            }
            if(index==-1){
                stack.add(cur);
            }else{
                stack.set(index,cur);
            }
           }
           pw.printf("Case %d: %d\n",counter++,stack.size());
       }
       pw.flush();
    }
}



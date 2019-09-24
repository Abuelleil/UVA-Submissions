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
    static ArrayList<Integer> Train;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        Thread.sleep(3000);
        while (br.ready()) {
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> discarded= new ArrayList<>();
            Queue<Integer> Numbers = new LinkedList<Integer>();
          StringTokenizer st= new StringTokenizer(br.readLine());
          int N= Integer.parseInt(st.nextToken());
          if(N==0) break;
          for(int i=1; i<=N;i++){
              ((LinkedList<Integer>) Numbers).add(i);
          }
          while (Numbers.size()>=2){
                discarded.add(((LinkedList<Integer>) Numbers).getFirst());
                ((LinkedList<Integer>) Numbers).removeFirst();
                ((LinkedList<Integer>) Numbers).addLast(((LinkedList<Integer>) Numbers).removeFirst());
          }
          sb.append("Discarded cards:");
          for(int j=0;j!=discarded.size();){
              if(discarded.size()-1==0){
                  sb.append(" "+discarded.remove(j));
              }
              else{
                  sb.append(" "+discarded.remove(j)+",");
              }
          }
          pw.println();
          pw.println(sb);
          pw.println("Remaining card: "+Numbers.remove());
        }
        pw.flush();
    }
}

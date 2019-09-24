
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
//        merge(arr, l, mid, r);
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

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int counter=0;
        while (true) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int first=Integer.parseInt(st.nextToken());
            if (first==0) {
                break;
            }
            if(counter++>0){
                pw.println();
            }
            int [] arr= new int[first];
            for(int i=0;i<first;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < first; i++) {
                for (int j = i + 1; j < first; j++) {
                    for (int k = j + 1; k < first; k++) {
                        for (int n = k + 1; n < first; n++) {
                            for (int m = n + 1; m < first; m++) {
                                for (int z = m + 1; z < first; z++) {
                                    pw.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[n]+" "+arr[m]+" "+arr[z]);
                                }
                            }
                        }
                    }
                }
            }
        }
        pw.flush();
    }
}

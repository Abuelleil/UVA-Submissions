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
    static int[] col;
    static int[] row;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        Thread.sleep(3000);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            col = new int[N];
            row = new int[N];
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                    row[i] += arr[i][j];
                    col[j] += arr[i][j];
                }
            }

            int counter = 0;
            int x = 0;
            int y = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (row[i] % 2 == 1 && col[j] % 2 == 1) {
                        row[i]--;
                        col[j]--;
                        x = i + 1;
                        y = j + 1;
                        counter++;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                if (row[i] % 2 == 1 || col[i] % 2 == 1) {
                    counter = 10;
                }
            }
            if (counter == 0) {
                pw.println("OK");
            } else if (counter == 1) {
                pw.println("Change bit " + "(" + x + "," + y + ")");
            } else {
                pw.println("Corrupt");
            }
        }
        pw.flush();
    }
}
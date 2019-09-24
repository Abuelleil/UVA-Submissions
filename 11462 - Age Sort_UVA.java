
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;


public class Main implements Comparable<Main> {
    int start;
    int end;
    int origin;

    public Main(int o, int s, int e) {
        this.origin = o;
        this.start = s;
        this.end = e;
    }

    @Override
    public int compareTo(Main o) {
        return this.origin - o.origin;
    }

    public static int inversion;
    public static int[] arr;

    public static int[] mergesort(int l, int r) { //O(nlogn)
        if (l == r) return new int[]{arr[l]};
        int mid = l + r >> 1;
        int[] left = mergesort(l, mid);
        int[] right = mergesort(mid + 1, r);
        int[] result = new int[r - l + 1];
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[idx++] = left[i++];
            } else {
                result[idx++] = right[j++];
                inversion += left.length - i;
            }

        }
        while (i < left.length) {
            result[idx++] = left[i++];
        }
        while (j < right.length) {
            result[idx++] = right[j++];
        }
        return result;
    }
    public String toString(){
        String s="";
        for(int i=0;i<arr.length;i++){
            s+=arr[i]+" ";
        }
        return s;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        Thread.sleep(3000);
        while (br.ready()) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if(N==0){
                break;
            }
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st1.nextToken());
            }
            int [] x=mergesort(0,arr.length-1);
            for(int i=0;i<arr.length;i++){
               if(i!=arr.length-1) {
                   pw.print(x[i] + " ");
               }else{
                   pw.print(x[i]);
               }
            }
            pw.println();
        }

        pw.flush();
    }
}
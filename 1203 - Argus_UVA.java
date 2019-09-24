package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;


public class Main implements Comparable  <Main> {
    static int id;
    static int period;
    static int basis;

    public Main(int id, int period, int basis) {
        this.period = period;
        this.id = id;
        this.basis = basis;
    }

    @Override
    public int compareTo(Main m) {
        if (this.period == n.period){
                return this.id-n.id;
            
        } else return this.period-n.period;
    }
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
        PriorityQueue<Object> Argus = new PriorityQueue<>();
        Thread.sleep(3000);
        while (true) {
            String [] s= br.readLine().split(" ");
            if (s[0].equals('#')){
                break;
            } else {
                int id = Integer.parseInt(.nextToken());
                int period = Integer.parseInt(st.nextToken());
                Main x = new Main(id, period, period);
                Argus.add(x);
            }
        }
        int x=Integer.parseInt(br.readLine());
        for(int i=0;i<=x;i++){
            pw.println(Argus.remove());
        }
    }
}

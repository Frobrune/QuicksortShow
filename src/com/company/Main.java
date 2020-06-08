package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Quicksort qs = new Quicksort();

        int range = 1000000;
        int length = 10000;


        int[] listToSort = qs.makeList(range,length);
        System.out.println(Arrays.toString(listToSort));

        long tstart = System.currentTimeMillis();
        qs.quickSort(listToSort,0,length-1);
        long tend = System.currentTimeMillis();
        System.out.println(Arrays.toString(listToSort));
        long time = tend - tstart;
        System.out.println("time (ms):" + time );
    }
}

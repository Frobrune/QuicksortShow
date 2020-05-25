package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Quicksort qs = new Quicksort();

        int range = 50;
        int length = 10;

        int[] listToSort = qs.makeList(range,length);
        System.out.println(Arrays.toString(listToSort));

        qs.quickSort(listToSort,0,length-1);
        System.out.println(Arrays.toString(listToSort));
    }
}

package com.company;
import java.util.Random;

public class Quicksort {


        public int[] makeList(int range, int length){
            int[] list = new int[length];
            Random rand = new Random();
            for(int i = 0; i < length; i++){
                list[i] = rand.nextInt(range);
            }
            return list;
        }

        public void quickSort(int[] list, int low, int high){
            if (list == null || list.length == 0)
                return;

            if (low >= high)
                return;


            int middle = low + (high - low) / 2;
            int pivot = list[middle];

            int i = low, j = high;
            while (i <= j) {
                while (list[i] < pivot) {
                    i++;
                }

                while (list[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    i++;
                    j--;
                }
            }
            if (low < j)
                quickSort(list, low, j);

            if (high > i)
                quickSort(list, i, high);
        }


}

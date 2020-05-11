package com.vipul.udemy.datastructures;

public class QuickSort {

    public static int[] quickSort(int[] input, int start, int end) {
        if (end - start < 2) {

            return input;

        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);

        quickSort(input, pivotIndex + 1, end);
        return input;
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        System.out.println("pivot= " +  pivot);
        while (i < j) {
            System.out.println("Checking I =  " + i + " < j = "+ j);

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot)
            {
                System.out.println("Empty loop 1 values = "+ input[i] + " and j = " + input[j]);
                System.out.println("Empty loop 1 i= " +i+  "j = " + j);
            }
            if (i < j) {
                System.out.println("before assignment loop1 i= "+ i + " and j = " + j);
                input[i] = input[j];
                System.out.println("after assignment loop1 i= "+ i + " and j = " + j);
                System.out.println("loop1 values i= "+ input[i] + " and j = " + input[j]);
            }
            System.out.println("outside loop1");
            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot)
            {
                System.out.println("Empty loop 2 values = "+ input[i] + " and j = " + input[j]);
                System.out.println("Empty loop 2 i = " +i+  "j = " + j);
            }
            if (i < j) {
                input[j] = input[i];
                System.out.println("loop2 i= "+ i + " and j = " + j);
                System.out.println("loop2 values i= "+ input[i] + " and j = " + input[j]);
            }
            System.out.println("outside loop2");

        }

        input[j] = pivot;
        return j;

    }
}

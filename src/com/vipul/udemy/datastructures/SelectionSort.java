package com.vipul.udemy.datastructures;

public class SelectionSort {

    public static  int[] selectionSortArray(int[] original_array){
        int i1;
        for(i1= original_array.length ; i1>0 ; i1 --)
        {
           //System.out.println("i1 ="+ i1);
            int largest_index=0;
            for(int j= 1 ; j< i1; j++)
            {
              //System.out.println("j=" + j);
                if (original_array[largest_index] <= original_array[j])
                {
                    largest_index = j;
                }

            }
            original_array = BubbleSort.swap(original_array,largest_index, i1-1);

        }
        return original_array;
    }
}

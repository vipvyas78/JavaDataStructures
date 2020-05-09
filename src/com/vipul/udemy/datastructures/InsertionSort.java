package com.vipul.udemy.datastructures;

public class InsertionSort {

    public static int[] doInsertionSort(int[] orgarray)
    {
        //initialize sorted array size

        int insertionElement = orgarray[1];

        //loop though the array to sort elements on the left
        for( int i =1 ; i<orgarray.length; i++ )
        {
           insertionElement = orgarray[i];
            //loop to compare arrays

            int j;
            for(j= i ; j> 0 && orgarray[j-1] > insertionElement  ; j--)
            {
                orgarray[j] = orgarray[j-1];

            }
            orgarray[j] = insertionElement;



        }

        return orgarray;
    }
}

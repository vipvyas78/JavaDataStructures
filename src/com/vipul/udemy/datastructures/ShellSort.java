package com.vipul.udemy.datastructures;

import static java.lang.Math.pow;

public class ShellSort {

    public static int[] shellSortArray(int[] origArray )
    {
       int[]  gaparray =  getGapValue(origArray.length);
       Main.printArray(origArray);
       for ( int i=gaparray.length; i >0; i--) {

            if (gaparray[i-1] == 0 )
                continue;
            else
            {
             System.out.println("gapInsertionSort = " + gaparray[i-1]);

                origArray = gapInsertionSort(origArray,(int) gaparray[i-1]);
                Main.printArray(origArray);
            }
        }
        return origArray;
    }

    public static int[] gapInsertionSort(int[] unSortedArray, int gap)
    {
        System.out.println(" Gap  = " + gap);


        for (int i =gap ; i < unSortedArray.length ; i+=gap )
        {
            int insertionElement = unSortedArray[i] ;
            System.out.println("i="+i);
            System.out.println( "insertion Element = " + insertionElement);
            int j = i;
            while( j >= gap && unSortedArray[j-gap] >insertionElement)
            {
                unSortedArray[j] = unSortedArray[j-gap];
                j-=gap;
            }
            unSortedArray[j] = insertionElement;
        }
        return  unSortedArray;
    }

    public static int[] getGapValue(int arrayLength)
    {
        double hebbardGap = 0;
         int[] gapSequence = new int[10];
        for (int i = 0 ; hebbardGap <= arrayLength ; i++ )
        {

             hebbardGap = pow(2,i+1) - 1;
            if ( hebbardGap <= arrayLength)
                gapSequence[i] = (int) hebbardGap;
            //System.out.println(hebbardGap);
                           ;
        }
        return gapSequence;
    }
}

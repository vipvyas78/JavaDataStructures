package com.vipul.udemy.datastructures;

public class BubbleSort {

    /*Swap method is used to swap the indices of the two arrays  */

    public static  int[] sortArray( int[] array1){
        for ( int loop1 = array1.length -1 ; loop1 >0 ;loop1 --){
            //Inner loop
            System.out.println("In out loop for value = " + loop1);
            for ( int loop2 =0 ; loop2 < loop1; loop2++){
                System.out.println("In the inner loop for value " + loop2);
                if (array1[loop2]>array1[loop2+1])
                    array1 = swap(array1, loop2, loop2 + 1);
                }
            }


        return array1;
    }

    public static int[]  swap(int[] array, int i, int j) {

        if (i == j) {
            System.out.println("Nothing to Swap");
            return  array;

        }
        if (!(checkArraySize(i, array.length) && checkArraySize(j, array.length)))
        {
        System.out.println("Check your array sizes");
        return array;

    }
        System.out.println("Swapping indecis "+ i + "and " + j);
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;

      return array;

}


    public static boolean checkArraySize(int indexsize, int length) {
        if (indexsize > length) {
            return false;
        }
       return  true;

    }

}

package com.vipul.udemy.datastructures;

public class BubbleSort {

    /*Swap method is used to swap the indices of the two arrays  */
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

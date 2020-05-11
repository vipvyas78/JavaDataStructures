package com.vipul.udemy.datastructures;

public class CountingSort {

    public static int[] doCountingSort(int[] origArray, int max, int min)
    {
        int[] countarray = new int[(max - min ) + 1];
        int[] finalarray = new int[(max- min ) + 1];
        for (int i=0; i < origArray.length; i++)
        {
            countarray[origArray[i]-min] =countarray[origArray[i]-min] + 1 ;
        }

        // Loop counter array and insert values
       int insertcount=0;
        for ( int j=0 ; j<countarray.length-1; j++)
        {

            //Increment insertcount till non zero values
               int revcounter = countarray[j];
               while(revcounter >0 )
               {
                   origArray[insertcount] = j+min;
                   revcounter--;
                   insertcount++;
               }
        }

        return origArray;
    }

}

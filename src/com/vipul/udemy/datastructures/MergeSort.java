package com.vipul.udemy.datastructures;

public class MergeSort {
    //Recursive Merge Sort implementation
//pass the array, start and end
    public static void  runMergeSort(int[] origArray, int startPoint, int endPoint)
    {

    //find midway
        int midway = (endPoint +  startPoint) /2 ;

     //dont find midway when its a single element array - Start merging
        if (endPoint - startPoint < 2  )
        {
         //break recursion
            return ;
        }


            //recursive merging for left
            runMergeSort(origArray, startPoint, midway);
            //recursive merging for right
            runMergeSort(origArray,midway, endPoint);
             mergeArray(origArray, startPoint, midway, endPoint  );


    }

    public static void mergeArray(int[]  unmergedArray, int start, int mid, int end )
    {
        if ( unmergedArray[mid -1 ] <  unmergedArray [mid]) {
            return ;
        }
        int i= start;
        int j= mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while ( i < mid && j < end)
        {
            if( unmergedArray[i]<=unmergedArray[j])
            {
                temp[tempIndex++] = unmergedArray[i++];
            }
            else
            {
                temp[tempIndex++] = unmergedArray[j++];
            }
            System.arraycopy(unmergedArray,i,unmergedArray,start + tempIndex, mid -i);
            System.arraycopy(temp,0,unmergedArray,start,tempIndex);

        }





    }
}

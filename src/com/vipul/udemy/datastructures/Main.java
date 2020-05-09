package com.vipul.udemy.datastructures;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[6];
        intArray[0] = 3;
        intArray[1] = -1;
        intArray[2] = 2;
        intArray[3] = 7;
        intArray[4] = -10;
        intArray[5] = 5;
        int i;
        int[] sortedArrayBubble;
        int[] sortedArraySelection;
        int[] sortedArrayInsertion;
        int[] sortedShellSort;
        int factorial;

            int index = -1;
/* BigO notation for the below step will be using worst case scenario . Linear time complexity as it varies with the index where the position is found.
    Retrieving without Index is  a time complexity of O(n)
    Add an element to full Array  == 0(n)
    Shift elements == 0(n)
    update Elements == 0(1) - In general if tehcode requires a loop then it is 0(n)
 */


        for(i=0; i < intArray.length ; i++)
        {
            if( intArray[i] == 5)
            {
                index = i;
                System.out.println("index = " + index);
                break;
            }
        }


       /* sortedArrayBubble = BubbleSort.sortArray(intArray);
        printArray(sortedArrayBubble);

        sortedArraySelection = SelectionSort.selectionSortArray(intArray);
        printArray(sortedArraySelection);

        sortedArrayInsertion = InsertionSort.doInsertionSort(intArray);
        printArray(sortedArrayInsertion);

        sortedShellSort = ShellSort.shellSortArray(intArray);
        printArray(sortedShellSort); */

        int num =7;
        factorial = Factorial.calculateFactorial(num);
        System.out.println("Factorial of " + num + " = "+ factorial);
        factorial = RecursiveFactorial.recFactorial(num);
        System.out.println("Factorial of " + num + " = "+ factorial);




    }


    public static void printArray(int[] printarray)
    {
        System.out.println("Printing New  Array");
        for (int i=0 ; i < printarray.length; i++ )
        {
            System.out.println(printarray[i]);
        }
    }

}

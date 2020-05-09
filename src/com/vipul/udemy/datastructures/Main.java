package com.vipul.udemy.datastructures;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[6];
        intArray[0] = 3;
        intArray[1] = -1;
        intArray[2] = 2;
        intArray[3] = 5;

            int index = -1;
/* BigO notation for the below step will be using worst case scenario . Linear time complexity as it varies with the index where the position is found.
    Retrieving without Index is  a time complexity of O(n)
    Add an element to full Array  == 0(n)
    Shift elements == 0(n)
    update Elements == 0(1) - In general if tehcode requires a loop then it is 0(n)
 */


        for(int i=0; i < intArray.length ; i++)
        {
            if( intArray[i] == 5)
            {
                index = i;
                System.out.println("index = " + index);
                break;
            }
        }

    }
}

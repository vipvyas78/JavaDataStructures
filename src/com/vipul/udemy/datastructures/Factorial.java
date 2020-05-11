package com.vipul.udemy.datastructures;

public class Factorial {
    public static int calculateFactorial(int num)
    {
        int factorial =1;
        int seq =1;
        if (num == 0 )
        {
            return factorial;
        }
        else
        {

        while ( seq <= num)
        {
            factorial = factorial * seq;
            seq++;
        }
        return factorial;
        }
    }
}

package com.vipul.udemy.datastructures;

public class RecursiveFactorial {
    public static int recFactorial (int num)
    {
        if (num ==0 )
        {
            return 1;
        }
        int factorial =1;
       // 2! = 2 * 1!
        // 3! = 3 * 2!
        // n! = n * (n-1)!
        factorial = num * recFactorial(num -1);
        return factorial;


    }
}

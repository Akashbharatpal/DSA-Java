/*
* You are given a number n
* You are required to calculate factorial of number n using recursion.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _4_FactorialRecursive {
    private long factorial(int n){
        if(n == 0 || n == 1) return 1;
        return (long) n * factorial(n-1);
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.print("factorial of n is: " + factorial(n));
    }
}

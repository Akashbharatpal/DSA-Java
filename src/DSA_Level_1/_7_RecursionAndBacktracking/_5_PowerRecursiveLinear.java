/*
* You are given two numbers x and n.
* You are required to calculate x raised to power of n.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _5_PowerRecursiveLinear {

    private int powerLinear(int x, int n){
        if(n == 0) return 1;
        return x * powerLinear(x, n-1);
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(), n = scn.nextInt();
        System.out.print(powerLinear(x, n));
    }
}

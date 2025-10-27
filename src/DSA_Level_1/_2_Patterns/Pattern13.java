/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          1
 *          1   1
 *          1   2   1
 *          1   3   3  1
 *          1   4   6   4   1
 *          1   5   10  10  5   1
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern13 {
    private int factorial(int n){
        int result = 1;
        while(n != 0){
            result *= n;
            n--;
        }
        return result;
    }
    private int combination(int r, int c){
        return factorial(r)/(factorial(c)*factorial(r-c));
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), sp=n/2+1;

        for(int i = 0; i < n; i++, sp-- ){
            for(int j = 0; j<=i; j++)
                System.out.print(combination(i, j) + "\t");
            System.out.println();
        }

    }
}

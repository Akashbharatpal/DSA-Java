/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          1
 *          2   3
 *          4   5   6
 *          7   8   9   10
 */
package _2_Patterns;

import java.util.Scanner;

public class Pattern11 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), c=1;

        for(int i=0; i<n; i++){
            for( int j=0; j<=i; j++)
                System.out.print(c++ + "\t");
            System.out.println();
        }
    }
}

/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *         *               *
 *              *      *
 *                 *
 *              *      *
 *         *               *
 */

package _2_Patterns;

import java.util.Scanner;

public class Pattern9 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for( int i = 0; i<n; i++){
            for( int j=0; j<n; j++){
                if((i==j) || (j==(n-i-1)))
                    System.out.print("*\t");
                else
                    System.out.print('\t');
            }
            System.out.println();
        }
    }
}

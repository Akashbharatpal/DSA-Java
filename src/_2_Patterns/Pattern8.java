/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *                      *
 *                  *
 *              *
 *          *
 */
package _2_Patterns;

import java.util.Scanner;

public class Pattern8 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for( int i=0; i<n; i++){
            for( int j = 1; j <= (n - i); j++ ){
                if (j == (n-i))
                    System.out.print('*');
                else
                    System.out.print('\t');
            }
            System.out.println();
        }
    }
}

/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          *
 *              *
 *                  *
 *                      *
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern7 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for( int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                if(i==j)
                    System.out.print('*');
                else
                    System.out.print('\t');
            }
            System.out.println();
        }
    }
}

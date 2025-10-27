/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *                       *
 *                   *   *
 *               *   *   *
 *           *   *   *   *
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern3 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
//            first print tabs
            for(int j = n-i; j > 1; j--)
                System.out.print("\t");

//            then print stars
            for(int j = 0; j <= i; j++)
                System.out.print("*\t");

            System.out.println();
        }
    }
}

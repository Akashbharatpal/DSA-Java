/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *           *   *   *   *
 *               *   *   *
 *                   *   *
 *                       *
 */

package _2_Patterns;

import java.util.Scanner;

public class Pattern4 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
//            first print tabs
            for(int j = i; j > 0; j--)
                System.out.print("\t");

//            then print *
            for(int j = n - i; j > 0; j--)
                System.out.print("*\t");
            System.out.println();
        }
    }
}

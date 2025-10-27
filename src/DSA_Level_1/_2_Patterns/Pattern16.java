/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          1                       1
 *          1   2               2   1
 *          1   2   3       3   2   1
 *          1   2   3   4   3   2   1
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern16 {
    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), sp = 2 * n - 3;

        for (int i = 1; i <= n; i++, sp-=2) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "\t");

            for (int j = 0; j < sp; j++)
                System.out.print('\t');

            for (int j = sp <= 0 ? i - 1 : i; j >= 1; j--)
                System.out.print(j + "\t");

            System.out.println();
        }
    }
}

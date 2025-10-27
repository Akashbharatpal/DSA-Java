/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *                  *
 *              *   *   *
 *          *   *   *   *   *
 *              *   *   *
 *                  *
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern5 {
    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2, st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++)
                System.out.print("\t");
            for (int j = 0; j < st; j++)
                System.out.print("*\t");

            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
}

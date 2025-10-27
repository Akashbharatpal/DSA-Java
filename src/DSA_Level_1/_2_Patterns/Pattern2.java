/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *           *   *   *   *
 *           *   *   *
 *           *   *
 *           *
 * */

package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern2 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--)
                System.out.print("*\t");
            System.out.println();
        }
    }
}

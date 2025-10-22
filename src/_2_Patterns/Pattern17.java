/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *                  *
 *                  *   *
 *          *   *   *   *   *
 *                  *   *
 *                  *
 */
package _2_Patterns;

import java.util.Scanner;

public class Pattern17 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), sp = n/2, st=1;

        for(int i=0; i<n; i++){
            if(i == n/2)
                for(int j=0;j<sp;j++)
                    System.out.print("*\t");
            else
                for(int j=0;j<sp;j++)
                    System.out.print("\t");

            for(int j=0; j<st; j++)
                System.out.print("*\t");

            if(i<n/2) st++;
            else st--;

            System.out.println();
        }
    }
}

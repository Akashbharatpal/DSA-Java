/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          *   *   *       *   *   *
 *          *   *               *   *
 *          *                       *
 *          *   *               *   *
 *          *   *   *       *   *   *
 */

package _2_Patterns;

import java.util.Scanner;

public class Pattern6 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), st = n/2 + 1, sp = 1;

        for(int i=0; i<n; i++){
//            print the stars
            for(int j=0; j<st; j++)
                System.out.print("*\t");
//            print the spaces
            for(int j=0; j<sp; j++)
                System.out.print('\t');

            for(int j=0; j<st; j++)
                System.out.print("*\t");

            if(i < n/2){
                st--;
                sp+=2;
            } else {
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}

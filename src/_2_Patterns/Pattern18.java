/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          *   *   *   *   *
 *              *       *
 *                  *
 *              *   *   *
 *          *   *   *   *   *
 */
package _2_Patterns;

import java.util.Scanner;

public class Pattern18 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), st=n, sp=0, isp=n-4;

        for(int i=0; i<n; i++){
            for(int j=0; j<sp; j++)
                System.out.print('\t');
//            second half of the pattern
            if(i >= n/2 || i == 0)
                for(int j=0; j<st; j++)
                    System.out.print("*\t");

//            print inner space within 2 *
            else {
                System.out.print("*\t");
                for(int j=0; j<isp; j++)
                    System.out.print('\t');
                System.out.print("*\t");
                isp-=2;
            }

            if(i < n/2){
                st-=2;
                sp++;
            } else {
                st+=2;
                sp--;
            }
            System.out.println();
        }
    }
}

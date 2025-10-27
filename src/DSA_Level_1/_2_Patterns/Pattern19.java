/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:              2
 *          *       *   *   *
 *       1  *       *
 *          *   *   *   *   *
 *                  *       * 3
 *          *   *   *       *
 *              4
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern19 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
//                to create +
                if(i==n/2 || j==n/2)
                    System.out.print("*\t");
//                1
                else if(j==0 && i<n/2)
                    System.out.print("*\t");
//                2
                else if(i==0 && j>n/2)
                    System.out.print("*\t");
//                3
                else if(j == n-1 && i > n/2)
                    System.out.print("*\t");
//                4
                else if(i == n-1 && j < n/2)
                    System.out.print("*\t");
                else
                    System.out.print('\t');
            }
            System.out.println();
        }
    }
}

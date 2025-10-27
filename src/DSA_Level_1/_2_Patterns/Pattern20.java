/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          *               *
 *          *               *
 *       1  *   2   *   3   *  1
 *          *   *       *   *
 *          *               *
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern20 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), isp = n-4, bsp=-1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
//                1
                if(j==0 || j==n-1)
                    System.out.print("*\t");
//                2
                else if(i>n/2 && j<n/2 && j == n-i-1)
                    System.out.print("*\t");
//                3
                else if(i>=n/2 && j>=n/2 && i==j)
                    System.out.print("*\t");
                else System.out.print('\t');
            }
            System.out.println();
        }
    }
}

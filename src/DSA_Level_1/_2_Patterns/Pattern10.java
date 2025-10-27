/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *                      *
 *                  *       *
 *              *               *
 *                  *       *
 *                      *
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern10 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), osp=n/2, isp=-1;

        for(int i=0; i<n; i++){
            for(int j=0; j<osp; j++)
                System.out.print('\t');

            System.out.print("*\t");

            for(int j=0; j<isp; j++)
                System.out.print('\t');
            if(isp > 0)
                System.out.print("*\t");

            if(i<n/2){
                osp--;
                isp+=2;
            } else{
                osp++;
                isp-=2;
            }
        System.out.println();
        }
    }
}

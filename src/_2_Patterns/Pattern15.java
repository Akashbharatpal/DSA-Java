/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *                  1
 *              2   3   2
 *          3   4   5   4   3
 *              2   3   2
 *                  1
 */
package _2_Patterns;

import java.util.Scanner;

public class Pattern15 {
   public void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt(), sp = n / 2, st = 1, ctr = 1;

       for(int i = 1; i <= n; i++){
           int act = ctr;
           for(int j=0; j<sp; j++)
               System.out.print('\t');
           for(int j=0; j<st; j++){
               System.out.print(act + "\t");
               if(j < st/2) act++;
               else act--;
           }

           if(i <= n/2){
               ctr++;
               sp--;
               st+=2;
           } else{
               ctr--;
               sp++;
               st-=2;
           }

           System.out.println();
       }
   }
}

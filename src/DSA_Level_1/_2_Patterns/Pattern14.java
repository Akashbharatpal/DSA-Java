/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          2 * 1 = 2
 *          2 * 2 = 4
 *          ...
 *          2 * 10 = 20
 */
package DSA_Level_1._2_Patterns;

import java.util.Scanner;

public class Pattern14 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i );
        }
    }
}

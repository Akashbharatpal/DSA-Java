/*
 * You are given a number n.
 * You've to create a pattern of * and separated by tab as shown below
 * input: n.
 * output:
 *          0
 *          1   1
 *          2   3   5
 *          8   13   21   34
 */
package _2_Patterns;

import java.util.Scanner;

public class Pattern12 {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), a=0, b=1;

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(a + "\t");
                int temp = b;
                b += a;
                a = temp;
            }
            System.out.println();
        }
    }
}

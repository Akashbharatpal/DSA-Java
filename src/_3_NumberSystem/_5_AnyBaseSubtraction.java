/*
 * you are given base b
 * you are given two numbers n1 and n2 of base b
 * You are required to subtract the numbers and print their value in base b.
 * */

package _3_NumberSystem;

import java.util.Scanner;

public class _5_AnyBaseSubtraction {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(), n1 = scn.nextInt(), n2 = scn.nextInt();
        int diff = 0, pow = 1;
        boolean borrow = false;

        while(n1 > 0){
            int d1 = n1 % 10, d2 = n2 %10, res;
            if(borrow) d1--;
            if( d1 < d2) {
                res = b + d1 - d2; // borrow
                borrow = true;
            } else {
                res = d1 - d2;
                borrow = false;
            }

            diff += pow * res;
            pow *= 10;
            n1 /= 10; n2 /= 10;
        }
        System.out.print(diff);
    }
}

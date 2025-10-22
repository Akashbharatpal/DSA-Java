/*
* You are given a number n
* You are given a base b. n is a number in base b
* You are required to convert n into its corresponding value in decimal number.
* */
package _3_NumberSystem;

import java.util.Scanner;

public class _2_AnyBaseToDecimal {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), b = scn.nextInt(),pow = 1, res = 0;

        for(int i = 0; n !=0; i++, n/=10, pow *= b)
            res += pow * (n%10);

        System.out.print(res);
    }
}

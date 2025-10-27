/*
* You are given a number n
* You are given a base b1. n is the number in base b1
* You are given another base b2
* You are required to convert n into a number in base b2.
* */
package DSA_Level_1._3_NumberSystem;

import java.util.Scanner;

public class _3_AnyBaseToAnyBase {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), b1 = scn.nextInt(), b2 = scn.nextInt();
        int pow = 1, res = 0;

//        divide the number by b2 and multiply each digit by pow(b1, index)
        for(int i=0; n!=0; i++, n/=b2, pow *= b1)
            res += pow * (n%b2);

        System.out.print(res);
    }
}

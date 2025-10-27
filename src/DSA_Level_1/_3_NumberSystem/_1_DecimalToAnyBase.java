/*
* You are given a decimal number n
* You are given a base b
* You are required to convert the number n into its corresponding value in base b.
* */
package DSA_Level_1._3_NumberSystem;

import java.util.Scanner;

public class _1_DecimalToAnyBase {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), b = scn.nextInt(), pow = 1, res = 0;
//        divide the number by the given base and print it in reverse
        for(int i=0; n!=0; i++, n/=b, pow *= 10)
            res += pow * (n%b);

        System.out.print(res);
    }
}

/*
* you are given base b
* you are given two numbers n1 and n2 of base b
* You are required to add the numbers and print their value in base b.
* */
package DSA_Level_1._3_NumberSystem;

import java.util.Scanner;

public class _4_AnyBaseAddition {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(), n1 = scn.nextInt(), n2 = scn.nextInt();
        int carry = 0, sum = 0, pow = 1;

        while(n1 > 0 || n2 > 0 || carry > 0) {
            int res = (n1 % 10) + (n2 % 10) + carry;
            n1/=10; n2/=10;
            carry = res / b;
            res %= b;
            sum += res * pow;
            pow *= 10;
        }
        System.out.print(sum);
    }
}

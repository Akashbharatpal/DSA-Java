/*
 * you are given base b
 * you are given two numbers n1 and n2 of base b
 * You are required to multiply the numbers and print their value in base b.
 * */
package DSA_Level_1._3_NumberSystem;

import java.util.Scanner;

public class _6_AnyBaseMultiplication {

    private int addition( int b, int n1, int n2){
        int sum = 0, pow = 1, carry = 0;

        while(n1 > 0 || n2 > 0 || carry > 0){
            int res = (n1 % 10) + (n2 % 10) + carry;
            carry = res / b;
            res %= b;
            sum += pow * res;
            pow *= 10;
            n1 /= 10; n2 /= 10;
        }
        return sum;
    }

    private int multiplyWithSingleDigit(int b, int n, int d){
        int ans = 0, carry = 0, pow = 1;
        while(n > 0 || carry > 0){
            int d1 = n % 10;
            n /= 10;

            int res = d1 * d + carry;
            carry = res / b;
            res %= b;
            ans += res * pow;

            pow *= 10;
        }
        return ans;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(), n1 = scn.nextInt(), n2 = scn.nextInt();
        int answer = 0, pow = 1;
        
        while(n2 > 0){
            int d2 = n2 % 10;
            n2 /= 10;
            int sprd = multiplyWithSingleDigit(b, n1, d2);
            answer = addition(b, answer, sprd * pow);
            pow *= 10;
        }
        System.out.print(answer);
    }
}

/*
 *Print the digits of a number n
 * */
package DSA_Level_1._1_Arithmetics;

import java.util.Scanner;

public class _5_DigitsOfANumber {

    private int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), digCount = countDigits(n);
        while (digCount != 0) {
            digCount--;
            int divisor = (int) Math.pow(10, digCount);
            System.out.print(n / divisor + ", ");
            n %= divisor;
        }
    }
}

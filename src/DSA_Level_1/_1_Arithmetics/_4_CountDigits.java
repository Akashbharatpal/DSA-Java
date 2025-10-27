/*
 * You've to count the number of digits in a number.
 * input: n the number for which the digit has to be counted.
 * output: Print the count of digits.
 * */

package DSA_Level_1._1_Arithmetics;

import java.util.Scanner;

public class _4_CountDigits {

    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt(), count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.print("Count: " + count);
    }
}

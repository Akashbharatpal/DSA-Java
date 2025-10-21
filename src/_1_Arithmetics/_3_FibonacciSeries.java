/*
 * You've to print first n fibonacci numbers.
 * input: n the count of fibonacci numbers to print.
 * output: print first n fibonacci numbers.
 * */
package _1_Arithmetics;

import java.util.Scanner;

public class _3_FibonacciSeries {

    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), prev = 0, curr = 1;
        while (n != 0) {
            System.out.print(prev + ", ");
            int temp = curr;
            curr += prev;
            prev = temp;
            n--;
        }
    }
}

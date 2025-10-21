/*
 * You've to print all prime numbers between a range
 * input: 1. "low" the lower limit of range.
 *        2. "high" the higher limit of range.
 * output: For the range print all prime numbers between low and high (both included).
 * */
package _1_Arithmetics;

import java.util.Scanner;

public class _2_PrimeNumbersInRange {

    boolean isPrime(int n) {
        for (int div = 2; div * div <= n; div++)
            if (n % div == 0)
                return false;
        return true;
    }

    void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int i = low; i <= high; i++)
            if (isPrime(i))
                System.out.print(i + ", ");
    }
}

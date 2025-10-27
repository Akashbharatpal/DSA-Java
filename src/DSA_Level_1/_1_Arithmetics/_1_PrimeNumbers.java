/*
 * check whether a number is prime or not
 * input: 1. take a number t as input representing count of integer to be tested.
 *        2. take a number n as input t times
 * output: For each input value of n print "prime" if the number is prime or "not prime" otherwise.
 * */
package DSA_Level_1._1_Arithmetics;

import java.util.Scanner;

public class _1_PrimeNumbers {

    boolean isPrime(int n) {
        for (int div = 2; div * div <= n; div++)
            if (n % div == 0)
                return false;
        return true;
    }

    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            if (isPrime(n))
                System.out.println(n + " is prime.");
            else
                System.out.println(n + " is not prime.");
        }

    }
}

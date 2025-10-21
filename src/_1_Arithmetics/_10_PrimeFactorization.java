/*
* You are required to find out Prime factors of a number.
* take number n as input.
* print all its prime factors in ascending order.
* */

package _1_Arithmetics;

import java.util.Scanner;

public class _10_PrimeFactorization {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

//        Try dividing number from 2, 3, ... till sqrt(n).
        for(int div = 2; div*div <= n; div++){
            while(n % div == 0){
                System.out.print(div + "\t");
                n /= div;
            }
        }
//        after complete burnout the only number left will be a prime number.
        if(n != 1)
            System.out.print(n);
    }
}

/*
* You are required to print Greatest Common Divisor(GCD) of 2 no.s
* You are also required to print Lowest Common Multiple (LCM) of 2 no.s.
* input: a and b.
* output: GCD and LCM.
* */
package _1_Arithmetics;

import java.util.Scanner;

public class _9_GCDAndLCM {

//    Euler's method or Division method
    private int gcd(int a, int b){
        while( a % b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();
        int gcd = gcd(a, b), lcm = (a * b)/ gcd;
        System.out.println("GCD: " + gcd + " LCM: " + lcm);
    }
}

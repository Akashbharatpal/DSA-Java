/*
* You are required to check if a given set of numbers is a valid Pythagorean Triplet.
* Take a, b and c as input
* Print true if they can form pythagorean triplet and false otherwise.
* */

package _1_Arithmetics;

import java.util.Scanner;

public class _11_PythagoreanTriplets {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();
        if (a > b && a > c)
            System.out.print( a*a == b*b + c*c );
        else if (b > a && b > c)
            System.out.print( b*b == a*a + c*c );
        else
            System.out.print( c*c == b*b + a*a );
    }
}

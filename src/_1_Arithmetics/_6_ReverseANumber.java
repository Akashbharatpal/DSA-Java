/*
* You've to display the digits of a number in reverse.
* input: n the number for the digits have to be displayed reverse.
* output: Print the digits of the number line-wise but in reverse order.
* */
package _1_Arithmetics;

import java.util.Scanner;

public class _6_ReverseANumber {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n != 0){
            System.out.print( n%10 + " " );
            n/=10;
        }
    }
}

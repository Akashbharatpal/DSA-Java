/*
* You are given a number following certain constraints
* the key constraint is if the number 5-digits long. it'll contain all the digits from 1-5 without missing any and without repeating any e.g. 23154.
* The inverse of a number is defined as the number created by interchanging the face value and index of the digits of the number.
* */
package DSA_Level_1._1_Arithmetics;

import java.util.Scanner;

public class _7_InverseOfANumber {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), inverse = 0, i = 1;
        while(n != 0){
            int pos = (n % 10) - 1;
            inverse += (int) Math.pow(10, pos) * i++;
            n/=10;
        }
        System.out.println(inverse);
    }
}

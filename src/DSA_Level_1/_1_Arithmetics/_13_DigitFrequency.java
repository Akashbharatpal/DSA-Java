/*
* You are given a number n
* You are given a digit d
* You are required to calculate the frequency of the digit d in number n
* */
package DSA_Level_1._1_Arithmetics;

import java.util.Scanner;

public class _13_DigitFrequency {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), d = scn.nextInt(), cnt = 0;
        while(n != 0){
            if(d == n%10) cnt++;
            n/=10;
        }
        System.out.println(cnt);
    }
}

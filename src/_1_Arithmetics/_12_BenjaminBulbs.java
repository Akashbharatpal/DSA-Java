/*
 * You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. in the 1st fluctuation all bulbs are toggled in the 2nd fluctuation every 2nd bulb is toggled in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations
 * take a number n as input. representing number of bulbs.
 * Print all the bulbs that will be on after the nth fluctuation.
 * */

package _1_Arithmetics;

import java.util.Scanner;

public class _12_BenjaminBulbs {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /*
         * Each i th fluctuation means it will toggle all the number of which i is the factor.
         * Also, if a number has even no. of factors then the net effect is cancelled. on -> off
         * Every perfect square has odd no. of factors.
         * so the answer is only perfect squares till n will be on.
         * */

//        This can be also solution of print perfect squares till n
        for(int i = 1; i * i <= n; i++)
            System.out.print(i*i + "\t");
    }
}

/*
 * You are given a number n representing number of stairs in a staircase.
 * You are standing at the bottom of the staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
 * You are required to print the list of all paths that can be used to climb the staircase up.
 * */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _22_PrintStairPaths {
    private void printStairPaths(int n, String ans){
        if(n <= 0){
            System.out.println(ans);
        }

        for(int i=1; i<=3; i++)
            if(n - i >= 0)
                printStairPaths(n - i, ans + i + " ");
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printStairPaths(n, "");
    }
}

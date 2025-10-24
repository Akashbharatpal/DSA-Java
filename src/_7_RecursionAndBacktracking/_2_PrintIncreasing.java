package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _2_PrintIncreasing {
    private void printIncreasing(int n){
        if(n == 0) return;
        printIncreasing(n-1);
        System.out.print(n + " ");
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printIncreasing(n);
    }
}

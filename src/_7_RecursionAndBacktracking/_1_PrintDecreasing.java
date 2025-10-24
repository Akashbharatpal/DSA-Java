package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _1_PrintDecreasing {
    private void printDecreasing(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printDecreasing(n-1);
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printDecreasing(n);
    }
}

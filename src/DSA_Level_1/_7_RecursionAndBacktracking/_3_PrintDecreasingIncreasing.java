package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _3_PrintDecreasingIncreasing {
    private void printDecreasingIncreasing(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printDecreasingIncreasing(n-1);
        System.out.print(n + " ");
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printDecreasingIncreasing(n);
    }
}

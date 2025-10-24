package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _7_PrintZigZag {
    private void printZigZag(int n){
        if(n == 0) return;
/*
*       To analyse such questions use Euler's tree diagram.
*  */
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printZigZag(n);
    }
}

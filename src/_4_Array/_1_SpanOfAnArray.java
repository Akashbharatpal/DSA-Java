/*
* You are given a number n. representing the count of elements
* You are given n numbers
* you are required to find span of input. Span is defined as the difference between max and min elements.
* */
package _4_Array;

import java.util.Scanner;

public class _1_SpanOfAnArray {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0], min = arr[0];
        for ( int i : arr){
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.print(max - min);
    }
}

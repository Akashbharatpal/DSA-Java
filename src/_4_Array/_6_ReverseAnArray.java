/*
* You are given an array of size n
* You are required to reverse the content of this array
* */
package _4_Array;

import java.util.Scanner;

public class _6_ReverseAnArray {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        for(int i=0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1] = temp;
        }

        for(int i: arr)
            System.out.print(i + "\t");
    }
}

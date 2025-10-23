/*
* You are given an array of size n
* You are given another number d
* You are required to check if d exist in the array and at what index (0 based). if found then print its index other print -1.
* */
package _4_Array;

import java.util.Scanner;

public class _2_FindAnElement {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int d = scn.nextInt();

        for(int i=0; i<arr.length; i++)
            if(arr[i] == d) {
                System.out.println(i);
                return;
            }
        System.out.print(-1);

    }
}

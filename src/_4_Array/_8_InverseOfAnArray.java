/*
* You are given an array of size n
* You are required to find its inverse.
* Inverse: store index value as an element on the index valued as element
* e.g. |3 |4 |1 |2 |0 |
*      |4 |2 |3 |0 |1 |
* */
package _4_Array;

import java.util.Scanner;

public class _8_InverseOfAnArray {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int[] inv = new int[n];
        for(int i = 0; i<n ;i++){
            inv[arr[i]] = i;
        }
        for(int ele: inv)
            System.out.print(ele + "\t");
    }
}

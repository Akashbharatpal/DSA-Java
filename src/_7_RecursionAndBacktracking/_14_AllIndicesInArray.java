/*
 You are given an array of size n
 You are also given a number x
 YOu are required to find out all the index of occurrence of x. store them in an array.
 */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _14_AllIndicesInArray {
    private int[] allIndices(int[] arr, int i, int x, int fsf){
        if(i ==  arr.length) return new int[fsf];
        if(arr[i] == x) fsf++;
        int[] res = allIndices(arr, i+1, x, fsf);
        if(arr[i]==x) res[fsf-1] = i;

        return res;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 3, 6, 4};
        int[] res = allIndices(arr, 0, x, 0);
        for(int ele: res)
            System.out.print(ele + " ");
    }
}

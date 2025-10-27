/*
 * You are given an array of size n
 * You are also given a number x
 * You are required to find the last index at which x occurs in array. otherwise print -1.
 * */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _13_LastIndexOfOccurrence {
    private int lastOccurrence(int[] arr, int i, int x){
        if(i == arr.length) return -1;

        int li = lastOccurrence(arr, i+1, x);
        if(li != -1) return li;
        else if(arr[i] == x) return i;
        else return -1;
    }

    public void main(String[] args){
        int[] arr = {2, 3, 9, 8, 7, 6, 4, 12, 7, 3, 8};
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.print("first occurrence of "+ x +" is at "+ lastOccurrence(arr, 0, x));
    }
}

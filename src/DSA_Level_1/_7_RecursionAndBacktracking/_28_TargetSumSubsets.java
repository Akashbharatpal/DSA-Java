/*
* You are given an array of size n.
* You are also given a number tar.
* You are required to calculate and print all subsets of given elements, the contents of which sum to tar.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _28_TargetSumSubsets {
    private void targetSumSubset(int[] arr, int i, int tar, int sum, String ans){
        if (i == arr.length) {
            if (sum == tar) {
                System.out.println(ans);
            }
            return;
        }

        targetSumSubset(arr, i+1, tar, sum, ans);
        targetSumSubset(arr, i+1, tar, sum+arr[i], ans + arr[i] + " ");

    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tar = scn.nextInt();
        int[] arr = {10, 20, 30, 40, 50};
        targetSumSubset(arr, 0, tar, 0, "");
    }
}

/*
* You are given an array of size n
* You are required to find max element inside this array.
* */
package _7_RecursionAndBacktracking;

public class _11_MaximumOfAnArray {
    private int maxOfArray(int[] arr, int i){
        if(i == arr.length - 1) return arr[i];
        return Math.max(maxOfArray(arr, i+1), arr[i]);
    }

    public void main(String[] args){
        int[] arr = {22, 33, 4, 19, 7, 56};
        System.out.print(maxOfArray(arr, 0));
    }
}

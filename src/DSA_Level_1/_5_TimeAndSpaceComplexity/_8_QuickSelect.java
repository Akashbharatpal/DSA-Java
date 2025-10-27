package DSA_Level_1._5_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _8_QuickSelect {
    private int partition(int[] arr, int p, int lo, int hi){
        int j = lo;
        for(int i = lo; i<=hi; i++){
            if(arr[i] <= p){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        return j - 1;
    }
    private int quickSelect(int[] arr, int k, int lo, int hi){
        int pi = partition(arr, arr[hi], lo, hi);
        if(pi == k - 1) return arr[pi];
        else if(pi < k - 1)
            return quickSelect(arr, k, pi + 1, hi);
        else return quickSelect(arr, k, lo, pi - 1);
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = {8, 3, 5, 7, 6, 1, 4, 2};
        int k = scn.nextInt();

        System.out.println(quickSelect(arr, k, 0, arr.length-1));
    }
}

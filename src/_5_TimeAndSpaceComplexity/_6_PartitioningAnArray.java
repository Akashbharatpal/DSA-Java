/*
* You are given an array of size n
* You are also given a number p as pivot
* You are required to arrange smaller or equal elements than pivot to left and larger element than pivot to right.
* */
package _5_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _6_PartitioningAnArray {
    private void partitionAnArray(int[] arr, int p){
/*
*        the entire array is divided into 3 regions
*           1. i to end -> unknown region
*           2. j to i-1 -> elements > p
*           3. 0 to j-1 -> elements <= p
*       algorithm:
*           1. if(arr[i] > p) i++; // increase the greater region.
*           2. else swap(arr, i, j); i++; j++; // increase smaller region and shift greater region.
*
* */
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < p) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        System.out.println(j);
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = {7, 9, 4, 8, 3, 6, 2, 1};
        int p = scn.nextInt();
        partitionAnArray(arr, p);

        for(int ele: arr)
            System.out.print(ele + " ");
    }
}

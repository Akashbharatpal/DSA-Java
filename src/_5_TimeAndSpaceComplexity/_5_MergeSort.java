/*
 * You are given an array of size n
 * You are required to sort the array using merge sort algorithm.
 * Time Complexity: O(N*Log(N))
 * */
package _5_TimeAndSpaceComplexity;

public class _5_MergeSort {
    private int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j])
                res[k++] = arr1[i++];
            else res[k++] = arr2[j++];
        }
        while(i < arr1.length)
            res[k++] = arr1[i++];
        while(j < arr2.length)
            res[k++] = arr2[j++];

        return res;
    }

    private int[] mergeSort(int[] arr, int lo, int hi){
        if(lo == hi){
            return new int[] {arr[lo]};
        }

        int mid = (lo + hi)/2;
        int[] first = mergeSort(arr, lo, mid);
        int[] second = mergeSort(arr, mid+1, hi);
        return mergeTwoSortedArrays(first, second);
    }

    public void main(String[] args){
        int[] arr = {5, 9, 8, 2, 1};

        arr = mergeSort(arr, 0, arr.length-1);

        for(int e: arr)
            System.out.print(e + "\t");
    }
}

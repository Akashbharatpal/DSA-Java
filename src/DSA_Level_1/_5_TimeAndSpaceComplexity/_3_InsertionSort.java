/*
 * You are given an array of size n
 * You are required to sort the array using insertion sort algorithm.
 * */
package DSA_Level_1._5_TimeAndSpaceComplexity;

public class _3_InsertionSort {
    private void insertionSort(int[] arr){
        /*
        * Insertion Sort:
        *       1. assume that array till i is sorted
        *       2. now find the position for i+1 element in that array.
        *       2. basically check whether arr[j] > arr[j+1] if yes then swap otherwise break because rest will be even smaller.
        *       3.time complexity: O(N^2).
        * */

        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void main(String[] args){
        int[] arr = {5, 9, 8, 2, 1};

        insertionSort(arr);

        for(int e: arr)
            System.out.print(e + "\t");
    }
}

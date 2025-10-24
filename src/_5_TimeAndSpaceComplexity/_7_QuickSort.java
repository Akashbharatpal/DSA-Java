/*
 * You are given an array of size n
 * You are required to sort the array using merge sort algorithm.
 * Time Complexity: O(N*Log(N))
 * note: if applied quickSort on sorted array then time complexity will be O(N^2);
 * */
package _5_TimeAndSpaceComplexity;

public class _7_QuickSort {
    private int partition(int[] arr, int p, int lo, int hi){
        int j=lo;
        for(int i=lo; i<=hi; i++){
            if(arr[i] <= p){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        return j - 1;
    }

    private void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi)
            return;
/*
*           1. consider last element of array as pivot
*           2. partition remaining array around that pivot
*           3. observe pivot will be in correct position now.
*           4. now perform similar operation of left and right array to pivot.
* */
        int pi = partition(arr, arr[hi], lo, hi);
        quickSort(arr, lo, pi - 1);
        quickSort(arr, pi + 1, hi);
    }

    public void main(String[] args){
        int[] arr = {5, 9, 8, 2, 1};

        quickSort(arr, 0, arr.length-1);

        for(int e: arr)
            System.out.print(e + "\t");
    }
}

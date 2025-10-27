/*
* You are given an array of size n
* You are required to sort the array using selection sort algorithm.
* */
package DSA_Level_1._5_TimeAndSpaceComplexity;

public class _2_SelectionSort {

    private void selectionSort(int[] arr) {
/*
*       Selection sort:
*           1. find the min element in the remaining array
*           2. swap it with the ith position.
*           3. time complexity: O(N^2).
* */
        for(int i=0; i < arr.length - 1; i++){
//          find the index of the minimum value in the remaining array
            int min = arr[i], mi = i;
            for(int j=i+1; j < arr.length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    mi = j;
                }
            }
//            swap arr[i] with arr[mi]
            int temp = arr[i];
            arr[i] = arr[mi];
            arr[mi] = temp;
        }
    }

    public void main(String[] args){
        int[] arr = {5, 9, 8, 2, 1};

        selectionSort(arr);

        for(int e: arr)
            System.out.print(e + "\t");
    }
}

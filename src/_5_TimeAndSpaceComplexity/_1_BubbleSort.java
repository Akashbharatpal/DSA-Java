/*
* You are given an array of size n
* You are required to sort the array using bubble sort algorithm
* */
package _5_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _1_BubbleSort {

    private void bubbleSort(int[] arr){
/*
*       bubble sort:
*           1. compare element from its previous if it is bigger, then swap it.
*           2. by the end of each iteration we are sure that bigger number is placed at its position.
*           3. time complexity: O(N^2).
*
* */
        for(int i=0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public void main(String[] args){
        int[] arr = {5, 9, 8, 2, 1};

        bubbleSort(arr);

        for(int e: arr)
            System.out.print(e + "\t");
    }
}

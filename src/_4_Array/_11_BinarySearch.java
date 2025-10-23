/*
* You are given a sorted array of size n
* You are alos given a number e (can be an element in array)
* You are required to find the index of given element otherwise print -1 if not present.
* */
package _4_Array;

import java.util.Scanner;

public class _11_BinarySearch {
    private int binarySearch(int[] arr, int e){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] < e)
                low = mid + 1;
            else if(arr[mid] > e)
                high = mid - 1;
            else return mid;
        }
        return -1;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int ele = scn.nextInt();

        System.out.print(binarySearch(arr, ele));
    }
}

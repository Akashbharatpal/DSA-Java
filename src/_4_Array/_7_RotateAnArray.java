/*
* You are given an array of size n
* you are also given a number k
* Rotate the array k times to right(k > 0) and to left (k < 0)
* */
package _4_Array;

import java.util.Scanner;

public class _7_RotateAnArray {
    private void reverse(int[] arr, int li, int ri){
        while(li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++; ri--;
        }
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int k = scn.nextInt();

/*      Algorithm:
       1. Divide the array into two parts |1 |2 |3 |4 |5 |6 |7 |8 |   (k = 3)
                                         <--------------><-------->
                                             p1              p2
       2. Reverse p1 and p2 separately.
       3. Reverse the entire array.
*/
        k = k % n;
        if(k < 0) k += n;
//        part 1
        reverse(arr, 0, n-k-1);
//        part 2
        reverse(arr, n-k, n-1);
//        full array
        reverse(arr, 0, n-1);

        for(int ele: arr)
            System.out.print(ele + "\t");
    }
}

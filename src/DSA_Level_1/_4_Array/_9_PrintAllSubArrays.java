/*
* You are given an array of size n
* You are required to print all possible subarrays.
* e.g. a b c
*       1. a
*       2. a b
*       3. a b c
*       4. b
*       5. b c
*       6. c
* */
package DSA_Level_1._4_Array;

import java.util.Scanner;

public class _9_PrintAllSubArrays {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        for(int i=0; i< arr.length; i++){
            for(int j=i; j < arr.length; j++){
                for(int k = i; k <= j; k++)
                    System.out.print(arr[k] + "\t");
                System.out.println();
            }
        }
    }
}

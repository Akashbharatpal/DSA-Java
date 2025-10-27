/*
* You are given an array of size n
* construct a bar chart using * where each element of the array represent height of the bar.
* */
package DSA_Level_1._4_Array;

import java.util.Scanner;

public class _3_BarChart {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

//        find the max of array
        int max = arr[0];
        for(int i: arr)
            if(i > max) max = i;

//        print the stars (max - arr[i]) --> space[i]
        for(int i=0; i < max; i++){
            for (int k : arr) {
                if ((max - k - i) > 0)
                    System.out.print('\t');
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

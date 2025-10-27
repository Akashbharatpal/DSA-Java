/*
* You are given sorted 2D Array of n*n
* Each row and column is sorted in increasing order
* You are given a number x
*
* */
package DSA_Level_1._6_2DArray;

import java.util.Scanner;

public class _10_SearchInASorted2DArray {
    public void main(String[] args){
        int[][] mat = {{11, 12, 13, 14},
                       {21, 22, 23, 24},
                       {31, 32, 33, 34},
                       {41, 42, 43, 44}};

        int i=0, j=mat.length - 1;
        Scanner scn = new Scanner(System.in);
        int ele = scn.nextInt();
        while(i < mat.length && j >= 0){
            if(mat[i][j] < ele) i++;
            else if(mat[i][j] > ele) j--;
            else {
                System.out.print("("+i+", "+j+")");
                break;
            }
        }
    }
}

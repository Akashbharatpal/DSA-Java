/*
* You are given a 2D array of size n * m. where elements are 0 or 1.
* You are standing in the top-left corner and have to reach the bottom-right corner.
* only 4 types of moves are allowed u (1-step up) l (1-step left) d (1-step down) r (1-step right)
* You can only move to cell which have 0 value in them. You can't move out of the boundaries or in the cells which have value 1 in them (1 means obstacle)
* YOu are required to print all paths that can be used to move from top-left to bottom-right.
*
* */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _27_FloodFill {
    private void floodFill(int[][] arr, int i, int j, String ans){
        if ( i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] >= 1) return;
        else if(i == arr.length - 1 && j == arr[0].length - 1){
            System.out.println(ans);
            return;
        }
        arr[i][j] += 1;
        floodFill(arr, i-1, j, ans + "t ");
        floodFill(arr, i, j+1, ans + "r ");
        floodFill(arr, i+1, j, ans + "d ");
        floodFill(arr, i, j-1, ans + "l ");
        arr[i][j] -= 1;
    }
    public void main(String[] args){
        int[][] arr = {{0, 1, 0, 0, 0, 0, 0},
                       {0, 1, 0, 1, 1, 1, 0},
                       {0, 0, 0, 0, 0, 0, 0},
                       {1, 0, 1, 1, 0, 1, 1},
                       {1, 0, 1, 1, 0, 1, 1},
                       {1, 0, 0, 0, 0, 0, 0}};

        floodFill(arr, 0,0, "");
    }
}

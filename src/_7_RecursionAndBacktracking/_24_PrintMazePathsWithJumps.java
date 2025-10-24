/*
 * You are given a number n and number m representing number of rows and columns in a maze
 * You are standing in the top-left corner and have to reach the bottom-right corner.
 * In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, ...) or 1 or more steps vertically as (v1, v2, ...) or 1 or more steps diagonally (as d1, d2, ...)
 * You are required to print the list of all paths that can be used to move from top-left to bottom-right.
 * */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _24_PrintMazePathsWithJumps {
    private void printMazePathsWithJumps(int n, int m, int i, int j, String ans){
        if(i >= n || j >= m) return;
        else if(i == n-1 && j == m-1){
            System.out.println(ans);
            return;
        }
//        horizontal traversal
        for(int k=1; k<m; k++)
            printMazePathsWithJumps(n, m, i, j + k, ans + "h" + k + " ");

//        vertical traversal
        for(int k=1; k<m; k++)
            printMazePathsWithJumps(n, m, i + k, j, ans + "v" + k + " ");

//        diagonal traversal
        for(int k=1; k<m && k<n; k++)
            printMazePathsWithJumps(n, m, i + k, j + k, ans + "d" + k + " ");

    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();

        printMazePathsWithJumps(n, m, 0, 0, "");
    }
}

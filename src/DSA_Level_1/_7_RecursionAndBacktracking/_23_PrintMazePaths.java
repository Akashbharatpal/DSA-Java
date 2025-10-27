/*
 * You are given a number n and a number m representing number of rows and columns in a maze.
 * You are standing in the top left corner and have to reach the bottom-right corner. Only two moves are allowed h (1-step horizontal) and v (1-step vertical)
 * You are required to print the list of all paths that can be used to move from top-left to bottom-right.
 * */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _23_PrintMazePaths {
    private void printMazePaths(int n, int m, int i, int j, String ans){
        if(i >= n || j >= m) return;
        else if(i == n-1 && j == m-1){
            System.out.println(ans);
            return;
        }
        printMazePaths(n, m, i, j + 1, ans + "h ");
        printMazePaths(n, m, i + 1, j, ans + "v ");
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();

        printMazePaths(n, m, 0, 0, "");
    }
}

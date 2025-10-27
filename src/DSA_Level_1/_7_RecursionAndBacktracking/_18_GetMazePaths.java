/*
* You are given a number n and a number m representing number of rows and columns in a maze.
* You are standing in the top left corner and have to reach the bottom-right corner. Only two moves are allowed h (1-step horizontal) and v (1-step vertical)
* You are required to get the list of all paths that can be used to move from top-left to bottom-right.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _18_GetMazePaths {
    private ArrayList<String> getMazePaths(int n, int m, int i, int j){
        if(i >= n || j >= m) return new ArrayList<>();
        else if(i == n-1 && j == m-1) return new ArrayList<>(List.of(""));

        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> res = getMazePaths(n, m, i+1, j);

        for(String ele: res)
            ans.add("v " + ele);
        res = getMazePaths(n, m, i, j+1);

        for(String ele: res)
            ans.add("h " + ele);

        return ans;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();

        ArrayList<String> paths = getMazePaths(n, m, 0, 0);

        for(String ele: paths)
            System.out.println(ele);
    }
}

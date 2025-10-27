/*
* You are given a number n and number m representing number of rows and columns in a maze
* You are standing in the top-left corner and have to reach the bottom-right corner.
* In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, ...) or 1 or more steps vertically as (v1, v2, ...) or 1 or more steps diagonally (as d1, d2, ...)
* You are required to get the list of all paths that can be used to move from top-left to bottom-right.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _19_GetMazePathsWithJump {

    private ArrayList<String> getMazePathsWithJump(int n, int m, int i, int j){
        if(i >= n || j >= m) return new ArrayList<String>();
        else if(i == n-1 && j == m-1) return new ArrayList<>(List.of(""));
        ArrayList<String> ans = new ArrayList<>();

//        horizontal traversal
        for(int k=1; k<m; k++){
            ArrayList<String> res = getMazePathsWithJump(n, m, i, j + k);
            for(String ele: res)
                ans.add("h" + k + " " + ele);
        }

//        vertical traversal
        for(int k=1; k<n; k++){
            ArrayList<String> res = getMazePathsWithJump(n, m, i + k, j);
            for(String ele: res)
                ans.add("v" + k + " " + ele);
        }

//        diagonal traversal
        for(int k=1; k<n && k<m; k++){
            ArrayList<String> res = getMazePathsWithJump(n, m, i + k, j + k);
            for(String ele: res)
                ans.add("d" + k + " " + ele);
        }
        return ans;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();

        ArrayList<String> res = getMazePathsWithJump(n, m, 0, 0);
        for(String ele: res)
            System.out.println(ele);
    }
}

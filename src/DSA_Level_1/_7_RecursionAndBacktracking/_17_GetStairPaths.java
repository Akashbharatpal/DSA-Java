/*
* You are given a number n representing number of stairs in a staircase.
* You are standing at the bottom of the staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
* You are required to get the list of all paths that can be used to climb the staircase up.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _17_GetStairPaths {
    private ArrayList<String> getStairPaths(int n){
        if(n <= 0) return new ArrayList<String>(List.of(""));

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<=3; i++){
            if(n-i >= 0) {
                ArrayList<String> res = getStairPaths(n - i);
                for(String ele: res)
                    ans.add(i + " " + ele);
            }
        }
        return ans;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<String> res =  getStairPaths(n);

        for(String ele: res)
            System.out.println(ele);
    }
}

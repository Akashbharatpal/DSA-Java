/*
* You are given a string.
* You are required to get all of its subsequences in a Arraylist.
* */
package _7_RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _15_GetSubsequence {
    private ArrayList<String> getSubsequence(String str){
        if(str.isEmpty()) return new ArrayList<>(List.of(""));

        String restStr = str.substring(1);
        ArrayList<String> res = getSubsequence(restStr);
        ArrayList<String> ans = new ArrayList<String>();
        for(String ele: res) {
            ans.add("_ " + ele);
            ans.add(str.charAt(0) + " " + ele);
        }

        return ans;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> res = getSubsequence(str);
        for(String ele: res)
            System.out.println(ele);
    }
}

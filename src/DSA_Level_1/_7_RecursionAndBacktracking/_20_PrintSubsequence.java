/*
* You are given a string str
* You are required to calculate and print all the subsequences of str.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _20_PrintSubsequence {
    private void printSubsequence(String str, String ans){
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        String ros = str.substring(1);
        printSubsequence(ros, ans + "_ ");
        printSubsequence(ros, ans + str.charAt(0) + " ");
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSubsequence(str, "");
    }
}

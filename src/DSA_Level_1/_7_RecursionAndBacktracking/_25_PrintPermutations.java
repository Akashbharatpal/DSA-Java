/*
* You are given a string str
* You are required to calculate and print all permutations of str.
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _25_PrintPermutations {
    private void printPermutations(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            String ros = str.substring(0, i) + str.substring(i+1);
            printPermutations(ros, ans + str.charAt(i) + " ");
        }
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printPermutations(str, "");
    }
}

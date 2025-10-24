/*
 * You are given a string str. The string str will contain numbers only, where each number stands for a key pressed on a mobile phone.
 * The following list is the key to character map
 * 0 -> .;
 * 1 -> abc
 * 2 -> def
 * 3 -> ghi
 * 4 -> jkl
 * 5 -> mno
 * 6 -> pqrs
 * 7 -> tu
 * 8 -> vwx
 * 9 -> yz
 *
 * you are required to print the list of all words that could be produced by the keys in str.
 * */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _21_PrintKeypadCombination {
    String[] keyMap = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    private void printKeypadCombination(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        String ros = str.substring(1);
        for(char ch: keyMap[str.charAt(0) - '0'].toCharArray())
            printKeypadCombination(ros, ans + ch + " ");
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printKeypadCombination(str, "");
    }
}

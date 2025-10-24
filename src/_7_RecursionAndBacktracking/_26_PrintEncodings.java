/*
* You are given a string str of digits. (will never start with a 0)
* You are required to encode the str as per following rules
* 1 -> a
* 2 -> b
* 3 -> c
* ...
* 25 -> y
* 26 -> z
*
* e.g.
* 123 -> abc, aw, lc
* 993 -> iic
* 103 -> jc
* 303 -> No output possible so print nothing.
* */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _26_PrintEncodings {
    private void printEncodings(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        int fd = str.charAt(0) - '0';
        if(fd > 0){
            char ch = (char) ((fd - 1) + 'a');
            printEncodings(str.substring(1), ans + ch + " ");
        }
        if(str.length() > 1) {
            int sd = str.charAt(1) - '0';
            if (fd > 0 && (10 * fd + sd) <= 26) {
                char ch = (char) (((10 * fd + sd) - 1) + 'a');
                printEncodings(str.substring(2), ans + ch + " ");
            }
        }
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printEncodings(str, "");
    }
}

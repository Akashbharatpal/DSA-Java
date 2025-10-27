/*
* You are given a str exp representing an expression.
* You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class _2_BalancedBrackets {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
            else if(!st.isEmpty() && ch == ')' && st.peek() == '(') st.pop();
            else if(!st.isEmpty() && ch == ']' && st.peek() == '[') st.pop();
            else if(!st.isEmpty() && ch == '}' && st.peek() == '{') st.pop();
            System.out.println(st);
        }
        System.out.println(st.isEmpty());
    }
}

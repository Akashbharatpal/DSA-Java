/*
* You are given a string exp representing an expression.
* Assume that the expression is balanced t.e. the opening and closing brackets match with each other.
* But some of the pair of brackets maybe extra/needless.
* You are required to print true if you detect extra brackets and false otherwise.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class _1_DuplicateBrackets {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch != ')') st.push(ch);
            else if(st.peek() == '('){
                System.out.println(true);
                return;
            } else {
                while(st.peek() != '(')
                    st.pop();
                st.pop();
            }
        }
        System.out.println(false);
    }
}

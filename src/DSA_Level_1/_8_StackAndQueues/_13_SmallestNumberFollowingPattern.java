/*
* You are given a pattern of upto 8 length containing characters i and d
* 'd' stands for decreasing and 'i' stands for increasing
* You have to print the smallest number using the digits 1 to 9 only without repetition such that the digits decreases following a d and increases following an i.
* e.g.
* ddd -> 4321
* iii -> 1234
* dddiddd -> 43218765
* iiddd -> 126543
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class _13_SmallestNumberFollowingPattern {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Integer> st = new Stack<>();
        int num = 1;
        for(char ch: str.toCharArray()){
            if(ch == 'd') st.push(num++);
            else if(ch == 'i') {
                st.push(num++);
                while (!st.isEmpty())
                    System.out.print(st.pop());
            }
        }
        st.push(num);
        while (!st.isEmpty())
            System.out.print(st.pop());
    }
}

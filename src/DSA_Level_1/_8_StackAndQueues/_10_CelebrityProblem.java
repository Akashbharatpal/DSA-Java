/*
* You are given an array of strings containing 0's and 1's
* If there is a 1 in ith row and jth column then person i knows about person j
* A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
* if there is a celebrity print its index otherwise print none.
* Note: There can be at most one celebrity.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Stack;

public class _10_CelebrityProblem {
    public void main(String[] args){
        String[] people = {"01111", "10110", "11011", "00000", "00010"};

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<people.length; i++)
            st.push(i);

/*        use method of elimination
               pop 2 people check if p1 knows p2 then we are sure that p1 cannot be a celebrity. but we cannot say about p2 so push it to stack again.
               similarly continue for rest of the candidates at the end you will be left with a one person that can be a celebrity hence we need to check the condition for celebrity.
*/
        while(st.size() != 1){
            int p1 = st.pop(), p2 = st.pop();
            if(people[p1].charAt(p2) == '1') st.push(p2);
            else st.push(p1);
        }
        int pc = st.pop();
        for(char ch: people[pc].toCharArray()) {
            if (ch == '1') {
                System.out.println("None");
                return;
            }
        }

        for(int i=0; i<people.length; i++){
            if(people[i].charAt(pc) == '0' && i!=pc){
                System.out.println("None");
                return;
            }
        }
        System.out.println(pc);
    }
}

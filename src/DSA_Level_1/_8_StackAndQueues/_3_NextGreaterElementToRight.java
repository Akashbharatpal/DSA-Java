/*
* You are given an array of size n.
* You are required to find next greater element on the right for all elements of array.
* Next greater element on the right of an element x is defined as the first element to right of x having value greater than x.
* Note -> If an element does not have any element on it's right side greater than it, consider -1 as its next greater element on right.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Stack;

public class _3_NextGreaterElementToRight {
    private int[] nextGreaterElement(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        ans[arr.length-1] = -1;
        for(int i=arr.length - 2; i>=0; i--){
            while(!st.isEmpty() && arr[i] > st.peek()) st.pop(); // first remove all the smaller elements
            if(st.isEmpty()) ans[i] = -1; // if stack is empty then put -1
            else ans[i] = st.peek(); // otherwise we found the next greater element to right
            st.push(arr[i]); // add itself may be a potential answer for rest elements to the left.
        }
        return ans;
    }
    public void main(String[] args){
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 7, 8};

        int[] ans = nextGreaterElement(arr);
        for(int ele: ans)
            System.out.print(ele + " ");
    }
}

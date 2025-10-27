/*
 * You are given an array of size n.
 * You are required to find next greater element on the right for all elements of array.
 * Next greater element on the right of an element x is defined as the first element to right of x having value greater than x.
 * Note -> If an element does not have any element on it's right side greater than it, consider -1 as its next greater element on right.
 * */
package DSA_Level_1._8_StackAndQueues;

import java.util.Stack;

public class _4_NextGreaterElementToRight2 {
    private int[] nextGreaterElement(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]) // pop out smaller elements and become their next greater element to right
                ans[st.pop()] = arr[i];
            st.push(i); // push your self as a potential candidate for other elements.
        }
        while(!st.isEmpty())
            ans[st.pop()] = -1; //at last the elements left on stack has no nger. therefore put -1.

        return ans;
    }
    public void main(String[] args){
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 7, 8};

        int[] ans = nextGreaterElement(arr);
        for(int ele: ans)
            System.out.print(ele + " ");
    }
}

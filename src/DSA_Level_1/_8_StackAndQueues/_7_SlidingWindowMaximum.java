/*
* You are given an array of size n.
* You are given a number k, representing the size of window.
* You are required to find and print the maximum element in every window of size k
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class _7_SlidingWindowMaximum {
    public void main(String[] args){
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 8, 12, 6, 19};
        int k = 4;

        int[] ngetr = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i])
                ngetr[st.pop()] = i;
            st.push(i);
        }
        while(!st.isEmpty()) ngetr[st.pop()] = arr.length;
        System.out.println(Arrays.toString(ngetr));
        for(int i=0; i <= arr.length - k; i++){
            int j = i;
            while(ngetr[j] < i + k)
                j = ngetr[j];
            System.out.print(arr[j] + " ");
        }
    }
}

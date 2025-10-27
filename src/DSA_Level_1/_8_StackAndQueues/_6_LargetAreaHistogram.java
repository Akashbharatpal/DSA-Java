/*
* You are given an array of size n.
* You are required to find and print the area of largest rectangle in the histogram.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Stack;

public class _6_LargetAreaHistogram {
    private int[] nextSmallerElementToRight(int[] arr){
        int[] ans  = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                if(!st.isEmpty()) ans[st.pop()] = i;
                else ans[st.pop()] = arr.length;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] = arr.length;
        return ans;
    }

    private int[] firstSmallestElementToLeft(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ans[0] = -1;
        for(int i=1;i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    private int largestAreaHistogram(int[] arr){
        int[] nsetr = nextSmallerElementToRight(arr);
        int[] fsetl = firstSmallestElementToLeft(arr);
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int area = arr[i] * (nsetr[i] - fsetl[i] - 1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
    public void main(String[] args){
        int[] arr = {6, 2, 5, 4, 4, 5, 1, 6};
        int area = largestAreaHistogram(arr);
        System.out.println(area);
    }
}

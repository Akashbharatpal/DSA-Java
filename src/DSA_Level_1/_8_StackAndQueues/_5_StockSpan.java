/*
* You are given an array of size n representing prices of a share on n days.
* You are required to find the stock span for n days.
* Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class _5_StockSpan {
    private int[] stockSpan(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ans[0] = 1;
        for(int i=1; i<arr.length; i++){
            // this is basically finding first greater element to the left.
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = i + 1;
            else ans[i] = i - st.peek();
            st.push(i);
        }
        return ans;
    }

    public void main(String[] args){
        int[] prices = {2,5,9,3,1,12,6,8,7};
        int[] ans = stockSpan(prices);

        System.out.println(Arrays.toString(ans));

    }
}

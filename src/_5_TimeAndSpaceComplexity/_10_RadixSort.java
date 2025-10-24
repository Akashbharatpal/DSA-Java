package _5_TimeAndSpaceComplexity;

public class _10_RadixSort {

    private void countSort(int[] arr, int exp){
        int[] ans = new int[arr.length];

        int[] freq = new int[10];
        for(int ele: arr)
            freq[ele / exp % 10]++;

        for(int i=1; i< freq.length; i++)
            freq[i] += freq[i-1];

        for(int i=arr.length-1; i>=0; i--)
            ans[freq[arr[i] / exp % 10]-- -1] = arr[i];

        System.arraycopy(ans, 0, arr, 0, ans.length);
    }

    private void radixSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int ele: arr)
            if(max < ele) max = ele;

        int exp = 1;
        while (exp <= max){
            countSort(arr, exp);
            exp *= 10;
        }
    }

    public void main(String[] args){
        int[] arr = {213, 97, 718, 123, 37, 443, 982, 64, 375, 683};

        radixSort(arr);

        for(int ele: arr)
            System.out.print(ele + " ");
    }
}

/*
 * You are given an array of size n;
 * You are required to sort this array using count sort algorithm.
 * assume all the elements in this array are always in a finite range.
 * */
package DSA_Level_1._5_TimeAndSpaceComplexity;

public class _9_CountSort {
    private void countSort(int[] arr) {
        int max = arr[0];
        for (int ele : arr)
            if (max < ele)
                max = ele;

        int[] freq = new int[max];
        for(int ele: arr)
            freq[ele-1]++;

        for(int i=0, j=0; j < freq.length; ){
            if(freq[j]-- > 0)
                arr[i++] = j+1;
            else j++;
        }
    }
// this method will also preserve the relative order of individual elements.
    private void countSortStable(int[] arr) {
        int max = arr[0], min = arr[0];
        for(int ele: arr) {
            if (ele > max) max = ele;
            else if (ele < min) min = ele;
        }
        int[] freq = new int[max - min + 1];
        for(int ele: arr)
            freq[ele - min]++;

        //prepare prefix array
        for(int i=1; i<freq.length; i++)
            freq[i] += freq[i-1];

        int[] ans = new int[arr.length];
        for(int i=arr.length-1; i >= 0; i--)
            ans[freq[arr[i]-min]-- - 1] = arr[i]; // here -1 is because we want to represent the position in array

        System.arraycopy(ans, 0, arr, 0, ans.length);
    }

    public void main(String[] args) {
        int[] arr1 = {9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};
        countSort(arr1);
        for (int ele : arr1)
            System.out.print(ele + ", ");

        System.out.println();

        int[] arr2 = {9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};
        countSortStable(arr2);
        for (int ele : arr2)
            System.out.print(ele + ", ");
    }
}

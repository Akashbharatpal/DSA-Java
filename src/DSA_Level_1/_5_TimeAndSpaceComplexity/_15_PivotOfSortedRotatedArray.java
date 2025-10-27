/*
* You are given a sorted array that might be rotated
* e.g. 10 20 30 40 50
*       1. 50, 10, 20, 30, 40
*       2. 40, 50, 10, 20, 30
*
* You need to find pivot for this array in O(log(N)) Time complexity.
*
* */
package DSA_Level_1._5_TimeAndSpaceComplexity;

public class _15_PivotOfSortedRotatedArray {
    private int pivotOfSortedRotatedArray(int[] arr){
        int lo = 0, hi=arr.length - 1;

        while(lo < hi) {
            int mid = (lo + hi) / 2;
            if(arr[mid] < arr[hi]) hi = mid;
            else lo = mid + 1;
        }
        return arr[lo];
    }

    public void main(String[] args){
        int[] arr = {30, 40, 50, 10, 20};
        int p = pivotOfSortedRotatedArray(arr);
        System.out.println(p);
    }
}

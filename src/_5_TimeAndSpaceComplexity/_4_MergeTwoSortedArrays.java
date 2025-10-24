/*
* You are given two sorted arrays of sizes n1 & n2 respectively.
* You are required to return a sorted array which is formed by merging the given arrays.
* Time complexity: O(N)
* */

package _5_TimeAndSpaceComplexity;

public class _4_MergeTwoSortedArrays {
    private int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i]<=arr2[j])
                res[k++] = arr1[i++];
            else res[k++] = arr2[j++];
        }
        while(i < arr1.length)
            res[k++] = arr1[i++];

        while(j < arr2.length)
            res[k++] = arr2[j++];

        return res;
    }

    public void main(String[] args){
        int[] arr1 = {2, 5, 7, 12, 18, 20};
        int[] arr2 = {7, 9, 11, 15, 25, 28, 30, 35};

        int[] merge = mergeTwoSortedArrays(arr1, arr2);

        for(int ele: merge)
            System.out.print(ele + ", ");
    }
}

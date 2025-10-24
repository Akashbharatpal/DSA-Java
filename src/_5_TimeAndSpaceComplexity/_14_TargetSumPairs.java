package _5_TimeAndSpaceComplexity;

public class _14_TargetSumPairs {
    private int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j])
                res[k++] = arr1[i++];
            else res[k++] = arr2[j++];
        }
        while(i < arr1.length)
            res[k++] = arr1[i++];

        while(j < arr2.length)
            res[k++] = arr2[j++];

        return res;
    }
    private int[] mergeSort(int[] arr, int lo, int hi){
        if(lo == hi)
            return new int[] {arr[lo]};

        int mid = (lo + hi)/2;
        int[] first = mergeSort(arr, lo, mid);
        int[] second = mergeSort(arr, mid + 1, hi);
        return mergeSortedArrays(first, second);
    }

    public void main(String[] args){
        int[] arr = {9, -48, 100, 43, 84, 74, 86, 34, -37, 60, -29, 44};
        int targetSum = 160;

        arr = mergeSort(arr, 0, arr.length-1);

        int i=0, j=arr.length-1;
        while(i < j){
            if(arr[i] + arr[j] < targetSum) i++;
            else if(arr[i] + arr[j] > targetSum) j--;
            else {
                System.out.println("("+arr[i] + ", "+ arr[j]+")");
                i++; j--;
            }
        }
    }
}

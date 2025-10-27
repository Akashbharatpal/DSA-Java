package DSA_Level_1._5_TimeAndSpaceComplexity;

public class _13_sort012 {
    private void sort012(short[] arr){
/*
            i=0, j=0, k=arr.length - 1
*       the entire array is divided into 4 regions
*               1. i to k: Unknown
                2. k+1 to e: region of 2's
                3. j to i-1: region of 1's
                4. 0 to j-1: region of 0's

       algorithm:
                if(arr[i] == 1) i++;
                else if(arr[i] == 0) swap(arr, i, j); i++; j++;
                else if(arr[i] == 2) swap(arr, i, k); k--;
* */
         for(int i=0, j=0, k=arr.length-1; i < k; i++){
             if(arr[i] == 2){
                 arr[i--] = arr[k];
                 arr[k--] = 2;
             } else if(arr[i] == 0){
                 arr[i] = arr[j];
                 arr[j++] = 0;
             }
         }
    }

    public void main(String[] args) {
        short[] arr = {1, 1, 2, 2, 0, 1, 2, 2, 1, 0, 1, 2, 0, 2, 1};

        sort012(arr);

        for (short ele : arr)
            System.out.print(ele + " ");
    }
}

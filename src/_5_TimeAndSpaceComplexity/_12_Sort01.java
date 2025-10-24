package _5_TimeAndSpaceComplexity;

public class _12_Sort01 {
    private void sort01(short[] arr){
//        use method of partitioning the array.
//        this method is very efficient as it can sort the array in one pass
        for(int i=0, j=0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = arr[j];
                arr[j++] = 0;
            }
        }
    }

    public void main(String[] args) {
        short[] arr = {1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1};

        sort01(arr);

        for(short ele: arr)
            System.out.print(ele + " ");
    }
}

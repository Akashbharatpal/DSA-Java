/*
* You are given an array of dates in the format of DDMMYYYY
* You are required to sort this array using radix sort
* */
package DSA_Level_1._5_TimeAndSpaceComplexity;

public class _11_SortDates {

    private void sortDates(String[] arr){
/*
 *       order of precedence is year > month > date.
 *       therefore sorting order is date --> month --> year.
 * */
        countSort(arr, 1000000, 100, 32);
        countSort(arr, 10000, 100, 13);
        countSort(arr, 1, 10000, 2501);
    }

    private void countSort(String[] arr, int div, int mod, int range){
        String[] ans = new String[arr.length];
        int[] freq = new int[range];

        for(String ele: arr)
            freq[Integer.parseInt(ele, 10) / div % mod]++;

        for(int i=1; i<freq.length; i++)
            freq[i] += freq[i-1];

        for(int i=arr.length-1; i>=0; i--)
            ans[freq[Integer.parseInt(arr[i], 10) / div % mod]-- - 1] = arr[i];

        System.arraycopy(ans, 0, arr, 0, ans.length);
    }

    public void main(String[] args){
        String[] Dates = {"12041996", "20101996", "05061997", "12041989", "11081987" };

        sortDates(Dates);

        for(String ele: Dates)
            System.out.print(ele + " ");
    }
}

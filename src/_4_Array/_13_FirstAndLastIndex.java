/**/
package _4_Array;

import java.util.Scanner;

public class _13_FirstAndLastIndex {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = {10, 20, 20, 20, 50, 60, 60, 60, 60, 100};

        int n = scn.nextInt();
        int lo = 0, hi = arr.length - 1;
        int fi = -1, li = -1;
//        first find the first index.
        while(lo <= hi){
            int mid = (lo + hi)/ 2;
            if(arr[mid] < n)
                lo = mid + 1;
            else if(arr[mid] > n)
                    hi = mid - 1;
            else {
                fi = mid;
                hi = mid - 1;
            }
        }

        lo = 0; hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo + hi)/ 2;
            if(arr[mid] < n)
                lo = mid + 1;
            else if(arr[mid] > n)
                hi = mid - 1;
            else {
                li = mid;
                lo = mid + 1;
            }
        }
        System.out.println("first index: " + fi + " last index: " + li);
    }
}

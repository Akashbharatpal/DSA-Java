/*
 * You are given an array of size n
 * You are required to print all possible subsets.
 * e.g. a b c
 *       1. _ _ _
 *       2. _ _ c
 *       3. _ b _
 *       4. _ b c
 *       5. a _ _
 *       6. a _ c
 *       7. a b _
 *       8. a b c
 * */
package DSA_Level_1._4_Array;

import java.util.Scanner;

public class _10_PrintAllSubsets {
    public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int limit = (int) Math.pow(2, arr.length);
        for(int i=0; i<limit; i++){
            String set = "";
            int temp = i;

            for(int j=arr.length-1;j >= 0; j--){
                int r = temp % 2;
                temp /= 2;
                if(r == 0)
                    set = "-\t" + set;
                else
                    set = arr[j] + "\t" + set;

            }
            System.out.println(set);
        }
    }
}

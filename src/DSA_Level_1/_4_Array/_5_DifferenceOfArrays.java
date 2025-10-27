/*
 * You are given 2 arrays of size n1 and n2 representing digits of 2 numbers respectively.
 * You are required to subtract the numbers represented by two arrays and print the array.
 * */
package DSA_Level_1._4_Array;

import java.util.Scanner;

public class _5_DifferenceOfArrays {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] num1 = new int[n1];

        for(int i=0; i<n1; i++)
            num1[i]=scn.nextInt();

        int n2 = scn.nextInt();
        int[] num2 = new int[n2];

        for(int i=0; i<n2; i++)
            num2[i]=scn.nextInt();

        int[] difference = new int[Math.max(n1, n2)];
        int i = num1.length - 1;
        int j = num2.length - 1;
        int k = difference.length - 1;
        boolean borrow = false;

        while(k >= 0){
            int num2v = j >= 0? num2[j--] : 0;
            int num1v = borrow ? num1[i] - 1 : num1[i];
            if(num1v < num2v){
                difference[k--] = 10 + num1v - num2v;
                borrow = true;
            }
            else {
                difference[k--] = num1v - num2v;
                borrow = false;
            }
            i--;
        }
//        remove all trailing zeros
        int idx = 0;
        for(int elm: difference)
            if(elm == 0) idx++;
            else break;
//        print rest digits
        while(idx < difference.length)
            System.out.print(difference[idx++] + "\t");
    }
}

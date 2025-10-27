/*
* You are given 2 arrays of size n1 and n2 representing digits of 2 numbers respectively.
* You are required to add the numbers represented by two arrays and print the array.
* */
package DSA_Level_1._4_Array;

import java.util.Scanner;

public class _4_SumOfArrays {
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

        int[] sum = new int[Math.max(n1, n2)];
        int carry = 0;
        int i = num1.length - 1;
        int j = num2.length - 1;
        int k = sum.length - 1;

        while(k >= 0) {
            int res = carry;
            if (i >= 0)
                res += num1[i--];

            if (j >= 0)
                res += num2[j--];

            sum[k--] = res % 10;
            carry = res / 10;
        }
        if(carry != 0)
            System.out.print(carry + "\t");
        for(int elm: sum)
            System.out.print(elm + "\t");
    }
}

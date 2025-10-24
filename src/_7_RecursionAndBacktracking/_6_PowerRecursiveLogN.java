package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _6_PowerRecursiveLogN {

    private int powerLogN(int x, int n){
        if(n == 0) return 1;
/*
        instead of x^n = x * x^(n-1)
        we can do x^n = x^n/2 * x^n/2 if n is even
        and x^n = x^n/2 * x^n/2 * x if n is odd.
        this way the time complexity has now become to O(logN).
*/
        int xpnb2 = powerLogN(x, n/2); // call once and store the result.
        if ((n & 1) == 0)
            return xpnb2 * xpnb2;
        else
            return x * xpnb2 * xpnb2;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(), n = scn.nextInt();
        System.out.print(powerLogN(x, n));
    }
}

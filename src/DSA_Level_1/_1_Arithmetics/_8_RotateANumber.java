/*
* You are given two numbers n and k. You are required to rotate n, k times to the right if k > 0 and left if k < 0.
* Also, k can have an absolute value larger than no. of digits of n.
* input: n and k
* output: Print the rotated number.
* */
package DSA_Level_1._1_Arithmetics;

import java.util.Scanner;

public class _8_RotateANumber {
    private int countDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    private int rotateNumber(int n, int k){
        int answer = 0, digCount = countDigits(n);
//                 (k > no of digits)(k < 0 and may be > no of digits).
        k = k >=0 ? (k % digCount) : digCount + (k % digCount);
        int offset = (int) Math.pow(10, k);
        int rNum = n % offset, lNum = n / offset;
        answer = rNum * (int) Math.pow(10, digCount - k) + lNum;
        return answer;
    }

    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), k = scn.nextInt();
        int answer = rotateNumber(n, k);
        System.out.println(answer);
    }
}

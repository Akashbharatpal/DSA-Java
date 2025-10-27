/*
* There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 & 3 are empty.
* The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
* You  are required to
*   1. Print the instruction to move the disks
*   2. from tower 1 to tower2 using tower 3 and
*   3 following the rules:
*       a. move 1 disk at a time
*       b. never place a smaller disk under a larger disk
*       c. you can only move a disk at the top
* */
package DSA_Level_1._7_RecursionAndBacktracking;

import java.util.Scanner;

public class _8_TowerOfHanoi {
    private void towerOfHanoi(int n, int t1, int t2, int t3){
        if(n == 0)return;
        towerOfHanoi(n-1, t1, t3, t2);
        System.out.println(t1 + " -> " + t2);
        towerOfHanoi(n-1, t3, t2, t1);
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        towerOfHanoi(n, 10, 20, 30);
    }
}

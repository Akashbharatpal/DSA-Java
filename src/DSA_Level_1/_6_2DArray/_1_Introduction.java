/*
* Memory view of 2D array
*       stack       |       heap
*       arr | --|---|-->| --|---->| 11 | 12 | 13 |
*                   |   | --|---->| 21 | 22 | 23 |
*                   |   | --|---->| 31 | 32 | 33 |
*                   |
*
* */
package DSA_Level_1._6_2DArray;

import java.util.Scanner;

public class _1_Introduction {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt(), c = scn.nextInt();

        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = scn.nextInt();

        for (int[] ints : arr) {
            for (int anInt : ints) System.out.print(anInt + "\t");
            System.out.println();
        }
    }
}

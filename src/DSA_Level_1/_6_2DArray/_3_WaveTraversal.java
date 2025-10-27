/*
* You are given a 2D array of size r*c
* You are required to traverse and print the contents of this array in form of wave - down the first column then up the second column and so on.
* e.g.
*            --->
*      | 11 ^ 12 | 13 ^ 14
*      | 21 | 22 | 23 | 24
*      V 31 | 32 V 33 | 34
*       --->     ---->
*
* therefore output will be
*   11 21 31 32 22 12 13 23 33 34 24 14
* */
package DSA_Level_1._6_2DArray;

public class _3_WaveTraversal {
    public void main(String[] args){
        int[][] arr = {{11, 12, 13, 14, 15},
                       {21, 22, 23, 24, 25},
                       {31, 32, 33, 34, 35}};

        int i=0, j=0;
        while(j < arr[0].length){
            i=0;
            while(i < arr.length)
                System.out.print(arr[i++][j] + " ");
            j++; i--;
            while(j < arr[0].length && i >= 0)
                System.out.print(arr[i--][j] + " ");
            j++;
        }
    }
}

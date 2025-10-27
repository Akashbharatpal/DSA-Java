/*
* You are given a 2D array of size r*c
* You are required to traverse and print the content of this array in form of a spiral.
* e.g.
*       11 12 13 14 15
*       21 22 23 24 25
*       31 32 33 34 35
*
*   directions: down -> right -> up -> left.
* output: 11 21 31 32 33 34 35 25 15 14 13 12 22 23 24.
* */
package DSA_Level_1._6_2DArray;

public class _4_SpiralTraversal {
    public void main(String[] args){
        int[][] arr = {{11, 12, 13, 14, 15, 16, 17},
                       {21, 22, 23, 24, 25, 26, 27},
                       {31, 32, 33, 34, 35, 36, 37},
                       {41, 42, 43, 44, 45, 46, 47},
                       {51, 52, 53, 54, 55, 56, 57}};

        int rmn = 0, rmx = arr.length;
        int cmn = 0, cmx = arr[0].length;
        int cnt = rmx * cmx, c=0;

        while(c < cnt){
//            left
            int i = rmn, j=cmn;
            while(c++ < cnt && i < rmx)
                System.out.print(arr[i++][j] + " ");
            cmn++; c--;

//            bottom
            i = rmx - 1; j = cmn;
            while(c++ < cnt && j < cmx)
                System.out.print(arr[i][j++] + " ");
            rmx--; c--;

//            right
            i = rmx - 1; j = cmx - 1;
            while(c++ < cnt && i >= rmn)
                System.out.print(arr[i--][j] + " ");
            cmx--; c--;

//            top
            i = rmn; j = cmx - 1;
            while(c++ < cnt && j >= cmn)
                System.out.print(arr[i][j--] + " ");
            rmn++; c--;
        }
    }
}
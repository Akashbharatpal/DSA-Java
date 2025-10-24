/*
* You are given a matrix of size n*n
* You are required to diagonally traverse the upper half of the matrix and print the contents.
* */
package _6_2DArray;

public class _7_DiagonalTraversal {
    public void main(String[] args){
        int[][] mat = {{11, 12, 13, 14},
                       {21, 22, 23, 24},
                       {31, 32, 33, 34},
                       {41, 42, 43, 44}};

        for(int k=0; k<mat.length; k++){
            int i=0, j=k;
            while(j < mat.length)
                System.out.print(mat[i++][j++] + " ");
        }
    }
}

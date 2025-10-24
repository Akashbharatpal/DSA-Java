/*
* You are given a number n representing the size of a chess board.
* You are required to place n number of queens in the n*n cells of board such that no queen can kill another.
* Note -  Queens kill at distance in all 8 directions
* */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _29_NQueens {
    private boolean isSafePlace(boolean[][] board, int row, int col){
        for (boolean[] booleans : board)
            if (booleans[col])
                return false;
        for(int i=row-1, j=col-1; i >= 0 && j >= 0; i--, j--)
            if(board[i][j])
                return false;
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++)
            if(board[i][j])
                return false;
        return true;
    }
    private void nQueens(boolean[][] board, String qsf, int row){
        if(row == board.length){
            System.out.println(qsf);
            return;
        }

        for(int i=0; i<board.length; i++){
            if(isSafePlace(board, row, i)) {
                board[row][i] = true;
                nQueens(board, qsf + "(" + row + ", " + i + ") ", row + 1);
                board[row][i] = false;
            }
        }
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] chessBoard = new boolean[n][n];
        nQueens(chessBoard, "", 0);
    }
}

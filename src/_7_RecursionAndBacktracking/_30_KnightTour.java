/*
* You are given a number n representing size of chess board.
* You are given a row and col as starting point for a knight piece.
* You are required to generate the moves of a knight starting in (row, col) such that knight visits all cells of the board exactly once.
* */
package _7_RecursionAndBacktracking;

import java.util.Scanner;

public class _30_KnightTour {
    private void knightTour(int[][] board, int row, int col, int move){
        if(row < 0 || col < 0 || row >= board.length || col >= board.length || board[row][col] > 0)return;
        else if(move == board.length * board.length){
            board[row][col] = move;
            for(int[] r: board){
                for(int e: r)
                    System.out.print(e + " ");
                System.out.println();
            }
            System.out.println();
            board[row][col] = 0;
            return;
        }
        board[row][col] = move;
        knightTour(board, row-2, col+1, move+1);
        knightTour(board, row-1, col+2, move+1);
        knightTour(board, row+1, col+2, move+1);
        knightTour(board, row+2, col+1, move+1);
        knightTour(board, row+2, col-1, move+1);
        knightTour(board, row+1, col-2, move+1);
        knightTour(board, row-1, col-2, move+1);
        knightTour(board, row-2, col-1, move+1);
        board[row][col] = 0;
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), x = scn.nextInt(), y = scn.nextInt();
        int[][] chessBoard = new int[n][n];
        knightTour(chessBoard, x, y, 1);
    }
}

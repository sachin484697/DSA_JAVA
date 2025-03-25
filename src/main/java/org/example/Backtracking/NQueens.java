package org.example.Backtracking;

public class NQueens {

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            disply(board);
            return 1;

        }
        //placing the queen and checking for every row and column
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }

        }
        return count;


    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //cheak vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }



    //dogonal left
        int maxLeft = Math.min(row, col);
        for(int i= 1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //dogonal right
        int maxRight = Math.min(row, board.length-col-1);
        for(int i= 1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
    return true;
}


    private static void disply(boolean[][] bord) {
       for(boolean[] row : bord){
           for(boolean element : row){
               if(element){
                   System.out.print("Q ");
               }else{
                   System.out.print("X ");
               }
           }
           System.out.println();


       }
    }


    public static void main(String[] args) {
      int n=4;
      boolean [][] board = new boolean[n][n];



    }
}

package recursion;

public class NQueens {
    public static void main(String[] args) {
        int row = 4;
        boolean[][] board = new boolean[row][row];
        System.out.println(queens(board,0));
    }
    public static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        //placing the queen and checking each row and column
        for (int col = 0; col<board.length; col++) {
            if(isSafe(board,row,col)) {
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        for(int i=0; i<row; i++) {
            if(board[i][col])
                return false;
        }

        //left diagonal
        int i=row-1,j=col-1;
        while (i>=0 && j>= 0) {
            if(board[i][j])
                return false;
            i--;
            j--;
        }

        //right diagonal
        i=row-1;j=col+1;
        while (i>=0 && j<board.length) {
            if(board[i][j])
                return false;
            i--;
            j++;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean element: row) {
                if(element) {
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

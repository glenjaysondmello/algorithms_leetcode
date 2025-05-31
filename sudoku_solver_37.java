class sudoku_solver_37 {
    public static void solveSudoku(char[][] board) {
        if(isSolve(board)) {
            System.out.println(board);
        }
    }

    static boolean isSolve(char[][] board) {
        int row = -1, col = -1;
        boolean isEmpty = false;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == '.') {
                    row = i;
                    col = j;
                    isEmpty = true;
                    break;
                }
            }

            if(isEmpty == true) {
                break;
            }
        }

        if(isEmpty == false) {
            return true;
        }

        for(int num = 1; num <= 9; num++) {
            if(isSafe(board, row, col, num)) {
                board[row][col] = (char) (num + '0');
                if(isSolve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, int num) {
        char ch = (char) (num + '0');

        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == ch) {
                return false;
            }
        }

        for(int i = 0; i < board.length; i++) {
            if(board[row][i] == ch) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);

        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String args[]) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);
    }
}


// Input: board = [["5","3",".",".","7",".",".",".","."],
//   ["6",".",".","1","9","5",".",".","."],
//   [".","9","8",".",".",".",".","6","."],
//   ["8",".",".",".","6",".",".",".","3"],
//   ["4",".",".","8",".","3",".",".","1"],
//   ["7",".",".",".","2",".",".",".","6"],
//   [".","6",".",".",".",".","2","8","."],
//   [".",".",".","4","1","9",".",".","5"],
//   [".",".",".",".","8",".",".","7","9"]]
  
// Output: [["5","3","4","6","7","8","9","1","2"],
//   ["6","7","2","1","9","5","3","4","8"],
//   ["1","9","8","3","4","2","5","6","7"],
//   ["8","5","9","7","6","1","4","2","3"],
//   ["4","2","6","8","5","3","7","9","1"],
//   ["7","1","3","9","2","4","8","5","6"],
//   ["9","6","1","5","3","7","2","8","4"],
//   ["2","8","7","4","1","9","6","3","5"],
//   ["3","4","5","2","8","6","1","7","9"]]


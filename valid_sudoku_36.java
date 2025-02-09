import java.util.*;

class valid_sudoku_36 {
    public static boolean isValidSudoku(char[][] board) {
        Set<String> sudoku = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curVal = board[i][j];
                if (curVal != '.') {
                    String rowVal = "Row " + i + " " + curVal;
                    String colVal = "Col " + j + " " + curVal;
                    String boxVal = "Box " + (i / 3) + "-" + (j / 3) + " " + curVal;

                    if (sudoku.contains(rowVal) || sudoku.contains(colVal) || sudoku.contains(boxVal)) {
                        return false;
                    }
                    sudoku.add(rowVal);
                    sudoku.add(colVal);
                    sudoku.add(boxVal);
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        char[][] board1 = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        char[][] board2 = {
                { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board1));
        System.out.println(isValidSudoku(board2));
    }
}

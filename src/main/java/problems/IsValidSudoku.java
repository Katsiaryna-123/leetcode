package problems;

import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hashSet = new HashSet<>();
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (!hashSet.add(board[i][j] + " in row " + i)
                            || hashSet.add(board[i][j] + " in column " + j)
                            || hashSet.add(board[i][j] + " in block " + i / 3 + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

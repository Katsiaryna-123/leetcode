package problems;

public class RotateImage {
    
    public void rotateOptimalSolution(int[][] matrix) {
        int last = matrix.length - 1;
        
        for (int j = 0; j < matrix.length / 2; j++) {
            
            for (int i = j; i < matrix.length - 1 - j; i++) {
                int topLeft = matrix[j][i];
                int topRight = matrix[i][last - j];
                int bottomRight = matrix[last - j][last - i];
                int bottomLeft = matrix[last - i][j];
                
                matrix[j][i] = bottomLeft;
                matrix[i][last - j] = topLeft;
                matrix[last - j][last - i] = topRight;
                matrix[last - i][j] = bottomRight;
            }
        }
    }
    
    public void rotateBruteForce(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        int row = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            row = matrix.length - 1;
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = matrix[row][i];
                row--;
            }
        }
    }
    
}

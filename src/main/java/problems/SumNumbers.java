package problems;

public class SumNumbers {
    public int sumNumbers(TreeNode root) {
        return calculateSum(root, 0);
    }
    
    private int calculateSum(TreeNode node, int currentSum) {
        if (node == null)
            return 0;
        
        currentSum = currentSum * 10 + node.val;
        if (node.left != null && node.right != null) {
            return currentSum;
        }
        
        return calculateSum(node.left, currentSum) + calculateSum(node.right, currentSum);
    }
}

package problems;

import java.util.Stack;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        Stack<TreeNode> stack = new Stack<>();
        
        while (root != null) {
            if (root.val >= low && root.val <= high) {
                result = result + root.val;
                
                
                stack.push(root.left);
                stack.push(root.right);
                
                root = stack.peek();
                stack.pop();
            }
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) {this.val = val;}
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

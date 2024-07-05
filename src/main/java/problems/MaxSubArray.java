package problems;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            
            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

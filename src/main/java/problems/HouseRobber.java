package problems;

import java.util.HashMap;

public class HouseRobber {
    HashMap<Integer, Integer> memo = new HashMap<>();
    
    public int rob(int[] nums) {
        return robFrom(0, nums);
    }
    
    private int robFrom(int indexToRobFrom, int[] nums) {
        if (indexToRobFrom > nums.length) {
            return 0;
        }
        
        if (memo.containsKey(indexToRobFrom)) {
            return memo.get(indexToRobFrom);
        }
        
        int robCurrent = nums[indexToRobFrom] + robFrom(indexToRobFrom + 2, nums);
        int robNext = robFrom(indexToRobFrom + 1, nums);
        
        int result = Math.max(robCurrent, robNext);
        
        memo.put(indexToRobFrom, result);
        
        return result;
    }
}

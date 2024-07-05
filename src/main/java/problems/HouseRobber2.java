package problems;

import java.util.HashMap;

public class HouseRobber2 {
    HashMap<String, Integer> memo = new HashMap<>();
    
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        return Math.max(robFrom(0, nums.length - 2, nums),
                        robFrom(1, nums.length - 1, nums));
    }
    
    private int robFrom(int indexToRobFrom, int indexToStop, int[] nums) {
        String key = indexToRobFrom + "-" + indexToStop;
        if (indexToRobFrom > indexToStop) {
            return 0;
        }
        
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        int robCurrent = nums[indexToRobFrom] + robFrom(indexToRobFrom + 2, indexToStop, nums);
        
        int robNext = robFrom(indexToRobFrom + 1, indexToStop, nums);
        
        int result = Math.max(robCurrent, robNext);
        
        memo.put(key, result);
        
        return result;
    }
}

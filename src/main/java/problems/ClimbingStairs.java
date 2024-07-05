package problems;

import java.util.HashMap;

public class ClimbingStairs {
    private HashMap<Integer, Integer> memoization = new HashMap<>();
    
    public int climbStairs(int numberOfStairs) {
        
        if (memoization.containsKey(numberOfStairs)) {
            return memoization.get(numberOfStairs);
        }
        
        if (numberOfStairs == 0 || numberOfStairs == 1) {
            return 1;
        }
        
        int oneStep = numberOfStairs - 1;
        int twoSteps = numberOfStairs - 2;
        
        var result = climbStairs(oneStep) + climbStairs(twoSteps);
        
        memoization.put(numberOfStairs, result);
        
        return memoization.get(numberOfStairs);
    }
}

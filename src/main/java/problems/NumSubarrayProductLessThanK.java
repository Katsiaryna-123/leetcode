package problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumSubarrayProductLessThanK {
    
    public int numSubarrayProductLessThanKBruteForce(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product = product * nums[j];
                if (product < k) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }
    
    public int numSubarrayProductLessThanKSlidingWindow(int[] nums, int k) {
        int right = 0;
        int left = 0;
        int result = 0;
        int product = 1;
        
        while (right < nums.length) {
            product = product * nums[right];
            if (product >= k) {
                product = product / nums[left];
                left++;
            }
            result = result + (right - left) + 1;
            right++;
        }
        return result;
    }
}

package problems;

import java.util.HashMap;

public class MaxSubarrayLength {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int right = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int result = 0;
        
        while (right < nums.length) {
            hashMap.put(nums[right], hashMap.getOrDefault(nums[right], 0) + 1);
            while (hashMap.get(nums[right]) > k) {
                hashMap.put(nums[left], hashMap.get(nums[left]) - 1);
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        
        return result;
    }
}

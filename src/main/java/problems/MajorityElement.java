package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public int majorityElementHashmap(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            if (!hashMap.containsKey(n)) {
                hashMap.put(n, 1);
            } else {
                hashMap.put(n, hashMap.get(n) + 1);
            }
        }
        
        Set<Integer> keyset = hashMap.keySet();
        int maxQuantityOfNum = 0;
        int mostRecentNum = 0;
        for (int b : keyset) {
            if (hashMap.get(b) > maxQuantityOfNum) {
                maxQuantityOfNum = hashMap.get(b);
                mostRecentNum = b;
            }
        }
        
        return mostRecentNum;
    }
    
    public int majorityElementSorting(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    
    public int majorityElementMoores(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        
        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }
            if (candidate == n) {
                count++;
            }
            if (candidate != n) {
                count--;
            }
        }
        return candidate;
    }
}

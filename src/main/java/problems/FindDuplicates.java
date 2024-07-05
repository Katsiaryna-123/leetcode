package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            if (!hashMap.containsKey(n)) {
                hashMap.put(n, 1);
            } else {
                hashMap.put(n, hashMap.get(n) + 1);
            }
        }
        
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) > 1) {
                result.add(i);
            }
        }
        return result;
    }
    
    public List<Integer> findDuplicatesBruteForce(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result.add(nums[i]);
                    break;
                }
            }
        }
        return result;
    }
    
    public List<Integer> findDuplicatesSorting(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}

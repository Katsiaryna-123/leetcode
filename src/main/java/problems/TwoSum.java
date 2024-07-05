package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], new ArrayList<>());
            }
            hashMap.get(nums[i]).add(i);
        }
        
        for (int num : nums) {
            int valueToSearch = target - num;
            
            if (valueToSearch == num) {
                if (hashMap.get(valueToSearch).size() > 1) {
                    result[0] = hashMap.get(valueToSearch).get(0);
                    result[1] = hashMap.get(valueToSearch).get(1);
                    return result;
                }
            } else if (hashMap.containsKey(valueToSearch)) {
                result[0] = hashMap.get(num).get(0);
                result[1] = hashMap.get(valueToSearch).get(0);
                return result;
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}
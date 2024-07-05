package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum;
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> hashSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            int left = i;
            int right = nums.length - 1;
            
            while (left + 1 < right) {
                sum = nums[i] + nums[left + 1] + nums[right];
                if (sum == 0) {
                    List<Integer> combination = Arrays.asList(nums[i], nums[left], nums[right]);
                    
                    if (!hashSet.contains(combination)) {
                        result.add(combination);
                        hashSet.add(combination);
                    }
                    
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        return result;
    }
}

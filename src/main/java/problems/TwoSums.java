package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSums {
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j])
                    return new int[]{i, j};
            }
        }
        throw new RuntimeException("not valid input");
    }
    
    public int[] twoSumHashTable(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], new ArrayList<>());
            }
            hashMap.get(nums[i]).add(i);
        }
        
        for (int num : nums) {
            int valueToSearch = target - num;
            ArrayList<Integer> indexes = hashMap.get(num);
            
            if (valueToSearch == num) {
                if (hashMap.get(valueToSearch).size() > 1) {
                    return new int[]{hashMap.get(valueToSearch).get(0), hashMap.get(valueToSearch).get(1)};
                }
            } else if (hashMap.containsKey(valueToSearch)) {
                return new int[]{indexes.get(0), hashMap.get(valueToSearch).get(0)};
            }
        }
        throw new RuntimeException("not valid input");
    }
    
    public int[] twoSumHashTableRepeat(int[] nums, int target) throws Exception {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            {
                if (!hashMap.containsKey(nums[i])) {
                    hashMap.put(nums[i], new ArrayList<>());
                }
                hashMap.get(nums[i]).add(i);
            }
        }
        
        int toSearch;
        for (int n : nums) {
            toSearch = target - n;
            
            if (n == toSearch) {
                if (hashMap.get(n).size() > 1) {
                    List<Integer> indexes = hashMap.get(toSearch);
                    return new int[]{indexes.get(0), indexes.get(1)};
                }
            } else if (hashMap.containsKey(toSearch)) {
                return new int[]{hashMap.get(toSearch).get(0),
                                 hashMap.get(n).get(0)};
            }
        }
        throw new RuntimeException("not valid input");
    }
}

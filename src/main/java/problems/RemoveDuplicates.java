package problems;

import java.util.HashSet;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[unique] = nums[i];
                unique = unique + 1;
            }
        }
        return unique;
        
    }
}

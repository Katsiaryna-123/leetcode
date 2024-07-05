package problems;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointerToNextNotZeroElement = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            pointerToNextNotZeroElement = i;
            if (nums[i] == 0) {
                while (pointerToNextNotZeroElement < nums.length - 1 && nums[pointerToNextNotZeroElement] == 0) {
                    pointerToNextNotZeroElement++;
                }
                nums[i] = nums[pointerToNextNotZeroElement];
                nums[pointerToNextNotZeroElement] = 0;
            }
        }
    }
    
    
    public void moveZeroesSorting(int[] nums) {
        Arrays.sort(nums);
    }
}

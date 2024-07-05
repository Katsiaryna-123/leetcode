package problems;

class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArrayFromTo(nums, 0, nums.length - 1);
        reverseArrayFromTo(nums, 0, k - 1);
        reverseArrayFromTo(nums, k, nums.length - 1);
    }
    
    private int[] reverseArrayFromTo(int[] nums, int from, int to) {
        
        while (from < to) {
            int saved = nums[from];
            nums[from] = nums[to];
            nums[to] = saved;
            from++;
            to--;
        }
        return nums;
    }
    
    private int[] reverseArray(int[] nums) {
        int length = nums.length;
        
        for (int i = 0; i < length / 2; i++) {
            int savedValue = nums[i];
            nums[i] = nums[length - 1 - i];
            nums[length - 1 - i] = savedValue;
        }
        return nums;
    }
    
}
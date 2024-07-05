package problems;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length-1; i++) {
            res^=nums[i];
        }
        return res;
    }
}

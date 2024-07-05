package problems;

import java.util.Arrays;

public class MergeSortedArray {
    public void mergeOptimalTwoPointerSolution(int[] nums1, int m, int[] nums2, int n) {
        int lastInNums1 = m - 1;
        int lastInNums2 = n - 1;
        int pointerToEnd = nums1.length - 1;
        
        while (lastInNums2 >= 0) {
            if (lastInNums1 >= 0 && nums2[lastInNums2] > nums1[lastInNums1]) {
                nums1[pointerToEnd] = nums2[lastInNums2];
                lastInNums2--;
            } else {
                nums1[pointerToEnd] = nums2[lastInNums1];
                lastInNums1--;
            }
            pointerToEnd--;
            
        }
        for (int j : nums1) {
            System.out.println(j);
        }
    }
    
    public void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        
        Arrays.sort(nums1);
        
        
        for (int j : nums1) {
            System.out.println(j);
        }
    }
}
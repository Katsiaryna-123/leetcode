package problems;

import java.util.*;

class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashset1 = new HashSet<>();
        for (int num : nums1) {
            hashset1.add(num);
        }
        
        HashSet<Integer> resultList = new HashSet<>();
        
        for (int n : nums2) {
            if (hashset1.contains(n)) {
                resultList.add(n);
            }
        }
        
        int[] resultArray = new int[resultList.size()];
        int index = 0;
        for (int n: resultList){
            resultArray[index] = n;
            index++;
        }
        return resultArray;
    }
    
}

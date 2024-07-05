package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        for (int n : nums1) {
            hashMap1.put(n, hashMap1.getOrDefault(n, 0)+1);
        }
        
        for (int n : nums2) {
            if (hashMap1.containsKey(n)) {
                result.add(n);
                hashMap1.put(n, hashMap1.get(n) - 1);
                if (hashMap1.get(n) == 0) {
                    hashMap1.remove(n);
                }
            }
        }
        
        int[] resultArray = new int[result.size()];
        
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
}

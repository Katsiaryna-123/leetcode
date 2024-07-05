package problems;

import java.util.HashMap;

public class MaxFrequencyElements {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }
        
        int maxFrequency = 0;
        
        for (int value : hashMap.values()) {
            if (value > maxFrequency) {
                maxFrequency = value;
            }
        }
        
        int numberOfFrequences = 0;
        
        for (int num : hashMap.values()) {
            
            if (num == maxFrequency) {
                numberOfFrequences++;
            }
        }
        return maxFrequency * numberOfFrequences;
    }
}

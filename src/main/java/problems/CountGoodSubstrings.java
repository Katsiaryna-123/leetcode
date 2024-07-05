package problems;

import java.util.HashMap;
import java.util.HashSet;

public class CountGoodSubstrings {
    public int countGoodSubstrings(String s) {
        int right = 0;
        int left = 0;
        HashSet<Character> hashMap = new HashSet<>();
        char[] arr = s.toCharArray();
        int result = 0;
        
        while (right < arr.length) {
            if (!hashMap.contains(arr[right])) {
                hashMap.add(arr[right]);
                if (hashMap.size() == 3) {
                    hashMap.remove(arr[left]);
                    result++;
                    left++;
                }
                right++;
            } else {
                while (arr[left] != arr[right]) {
                    hashMap.remove(arr[left]);
                    left++;
                }
                hashMap.remove(arr[left]);
                left++;
                
                hashMap.add(arr[right]);
                right++;
            }
        }
        return result;
    }
    
    public int countGoodSubstringsNormal(String s) {
        int right = 0;
        int left = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] arr = s.toCharArray();
        int result = 0;
        
        while (right < arr.length) {
            while (right - left < 3) {
                hashMap.put(arr[right], hashMap.getOrDefault(arr[right], 0) + 1);
                right++;
            }
            if (hashMap.size() == 3) {
                result++;
                hashMap.put(arr[left], hashMap.get(arr[left]) - 1);
                if (hashMap.get(arr[left]) == 0) {
                    hashMap.remove(arr[left]);
                }
                left++;
            }
            right++;
        }
        
        return result;
    }
}

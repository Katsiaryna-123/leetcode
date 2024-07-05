package problems;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String letterInS : sArr) {
            if (!hashMap.containsKey(letterInS)) {
                hashMap.put(letterInS, 1);
            } else {
                hashMap.put(letterInS, hashMap.get(letterInS) + 1);
            }
        }
        
        for (String letterInT : tArr) {
            if (hashMap.containsKey(letterInT)) {
                hashMap.put(letterInT, hashMap.get(letterInT) - 1);
                if (hashMap.get(letterInT) == 0) {
                    hashMap.remove(letterInT);
                }
            } else {
                return false;
            }
        }
        
        return hashMap.isEmpty();
    }
}

package problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class CustomSortString {
    public String customSortString(String order, String s) {
        StringBuilder resultString = new StringBuilder();
        
        String[] sArr = s.split("");
        HashMap<String, Integer> hashSet = new HashMap<>();
        
        for (String c : sArr) {
            hashSet.put(c, hashSet.getOrDefault(c, 0)+1);
        }
        
        String[] orderArr = order.split("");
        
        for (final String string : orderArr) {
            if (hashSet.containsKey(string)) {
                int frequency = hashSet.get(string);
                resultString.append(String.valueOf(string).repeat(Math.max(0, frequency)));
                hashSet.remove(string);
            }
        }
        if (!hashSet.isEmpty()) {
            for (String b :  hashSet.keySet()) {
                int frequency= hashSet.get(b);
                resultString.append(String.valueOf(b).repeat(Math.max(0, frequency)));
              
            }
        }
        return resultString.toString();
    }
}
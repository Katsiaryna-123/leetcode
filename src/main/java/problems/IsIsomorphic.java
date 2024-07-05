package problems;

import java.util.HashMap;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int prev = 0;
        HashMap<Integer, Character> sHashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sHashmap.containsValue(s.charAt(i))) {
                sHashmap.put(prev + 1, s.charAt(i));
                prev = prev + 1;
            }
        }
        
        prev = 0;
        HashMap<Integer, Character> tHashmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (!tHashmap.containsValue(t.charAt(i))) {
                tHashmap.put(prev + 1, t.charAt(i));
                prev = prev + 1;
            }
        }
        
        if (sHashmap.size() != tHashmap.size()) {
            return false;
        }
        
        HashMap<Character, Character> mapping = new HashMap<>();
        for (int i = 1; i <= sHashmap.size(); i++) {
            mapping.put(sHashmap.get(i), tHashmap.get(i));
        }
        
        StringBuilder mappedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            mappedString.append(mapping.get(s.charAt(i)));
        }
        
        return t.contentEquals(mappedString);
    }
}

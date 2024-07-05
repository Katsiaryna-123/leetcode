package problems;

import java.util.HashMap;

public class ValidString {
    public boolean isStringValid(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> charsCount = new HashMap<>();
        
        for (char c : chars) {
            if (!charsCount.containsKey(c)) {
                charsCount.put(c, 1);
            } else {
                charsCount.put(c, charsCount.get(c) + 1);
            }
        }
        
        int occurrenceCount = charsCount.get(chars[0]);
        
        for (int count : charsCount.values()) {
            if (count != occurrenceCount) {
                return false;
            }
        }
        return true;
    }
}

package problems;

public class StrStr {
    public int strStr(String haystack, String needle) {
        int right = needle.length();
        int left = 0;
        
        if (haystack.length() < needle.length()) {
            return -1;
        }
        
        String part = haystack.substring(left, right);
        
        
        if (haystack.equals(needle)) {
            return 0;
        }
        
        while (right < haystack.length())
            if (part.equals(needle)) {
                return left;
            } else {
                right++;
                left++;
                part = haystack.substring(left, right);
                if (part.equals(needle)) {
                    return left;
                }
            }
        
        return -1;
    }
}

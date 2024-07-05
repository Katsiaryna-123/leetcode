package problems;

public class ValidPalindrome {
    public boolean isPalindromeStringBuilder(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    
    public boolean isPalindromeTwoPointers(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        char[] arr = s.toCharArray();
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            if (arr[first] != arr[last]) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}

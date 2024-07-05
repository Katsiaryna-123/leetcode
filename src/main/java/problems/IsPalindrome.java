package problems;

public class IsPalindrome {
    public boolean isPalindromeWithStringBuilder(int x) {
        StringBuilder number = new StringBuilder();
        number.append(x);
        StringBuilder reversedNumber = number.reverse();
        return reversedNumber.toString().equals(String.valueOf(x));
    }
    
    public boolean isPalindromeWithoutStringBuilder(int x) {
        if (x < 0) {
            return false;
        }
        String number = String.valueOf(x);
        String[] arr = number.split("");
        String reversedString = "";
        
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedString = reversedString + arr[i];
        }
        
        return reversedString.equals(number);
    }
    
    public boolean isPalindromeString(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (Character.isLetterOrDigit(arr[left])) {
                if (Character.isLetterOrDigit(arr[right])) {
                    if (Character.toLowerCase(arr[left]) != Character.toLowerCase(arr[right])) {
                        return false;
                    } else {
                        right--;
                        left++;
                    }
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        
        return true;
    }
}

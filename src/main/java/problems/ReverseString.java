package problems;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char saved = s[start];
            s[start] = s[end];
            s[end] = saved;
            start++;
            end--;
        }
    }
}

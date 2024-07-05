package problems;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        char[] arr = s.toCharArray();
        int count = 0;
        int i = s.length() - 1;
        
        while (i >= 0 && Character.isLetter(arr[i])) {
            count++;
            i--;
        }
        
        return count;
    }
    
    public int lengthOfLastWordSplit(String s) {
        s = s.strip();
        String[] arr = s.split(" ");
        
        return arr[arr.length-1].length();
    }
}

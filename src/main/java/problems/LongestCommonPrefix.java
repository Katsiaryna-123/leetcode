package problems;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String[][] arr = new String[strs.length][];
        String res = "";
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = strs[i].split("");
            if (arr[i].length < minLength) {
                minLength = arr[i].length;
            }
        }
        //letter
        for (int i = 0; i < minLength; i++) {
            String currentLetter = arr[0][i];
            //word
            for (int k = 1; k < arr.length; k++) {
                if (!currentLetter.equals(arr[k][i])) {
                    return res;
                }
            }
            res = res + currentLetter;
        }
        return res;
    }
}

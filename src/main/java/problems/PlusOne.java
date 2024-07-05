package problems;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        
        if (digits[0] == 0) {
            int[] extendedArray = new int[digits.length + 1];
            extendedArray[0] = 1;
            for (int i = 1; i < extendedArray.length; i++) {
                extendedArray[i] = 0;
            }
            return extendedArray;
        }
        
        return digits;
    }
}

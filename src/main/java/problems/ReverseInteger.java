package problems;

public class ReverseInteger {
    public int reverse(int x) {
        String num = String.valueOf(x);
        boolean isNegative = x < 0;
        String result = "";
        int resultInt = 0;
        
        String[] strings = num.split("");
        for (int i = num.length() - 1; i >= 0; i--) {
            result = result + strings[i];
        }
        
        try {
            resultInt = Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
        
        if (isNegative) {
            return -resultInt;
        }
        return resultInt;
    }
}

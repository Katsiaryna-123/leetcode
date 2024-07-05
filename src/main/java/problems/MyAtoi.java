package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyAtoi {
    public int myAtoi(String s) {
        s = s.strip();
        
        boolean isNegative = false;
        int i = 0;
        if (s.startsWith("-")) {
            isNegative = true;
            i++;
        } else if (s.startsWith("+")) {
            i++;
        }
        
        long res = 0;
        for (; i < s.length() && Character.isDigit(s.charAt(i)); i++) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            
            if (res > Integer.MAX_VALUE) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        
        return isNegative ? (int) -res : (int) res;
    }
}

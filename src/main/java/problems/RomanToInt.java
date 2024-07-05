package problems;

import java.util.HashMap;
import java.util.Objects;

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<String, Integer> symbols = new HashMap<>();
        symbols.put("I", 1);
        symbols.put("V", 5);
        symbols.put("X", 10);
        symbols.put("L", 50);
        symbols.put("C", 100);
        symbols.put("D", 500);
        symbols.put("M", 1000);
        
        String[] number = s.split("");
        int sum = 0;
        
        for (int i = 1; i < number.length; i++) {

            if (Objects.equals(number[i - 1], "I") && number[i].equals("V") || number[i].equals("X")) {
                sum = sum + symbols.get(number[i]) - 2;
            } else {
                sum = sum + symbols.get(number[i]);
            }
        }
        return sum;
    }
}

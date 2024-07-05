package problems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        
        HashMap<Character, Character> openClosed = new HashMap<>();
        openClosed.put('(', ')');
        openClosed.put('{', '}');
        openClosed.put('[', ']');
        
        Stack<Character> openedParentheses = new Stack<>();
        
        char[] parentheses = s.toCharArray();
        for (char c : parentheses) {
            if (c == '(' || c == '{' || c == '[') {
                openedParentheses.push(openClosed.get(c));
            } else {
                if (openedParentheses.empty()) {
                    return false;
                }
                if (c == openedParentheses.peek()) {
                    openedParentheses.pop();
                } else {
                    return false;
                }
            }
        }
        
        return openedParentheses.empty();
    }
}

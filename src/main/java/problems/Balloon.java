package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Balloon {
    public int getNumberOfBalloonsInWord(String s) {
        HashMap<Character, Integer> balloonMap = getMapOfChars("balloon");
        HashMap<Character, Integer> stringMap = getMapOfChars(s);
        
        Character[] balloonLetters = balloonMap.keySet().toArray(new Character[0]);
        Set<Character> stringKeyset = stringMap.keySet();
        int res = 0;
        int numberOfLettersInString;
        int numberOfLettersInBalloon;
        
        while (stringKeyset.containsAll(List.of(balloonLetters))) {
            for (final Character balloonLetter : balloonLetters) {
                numberOfLettersInString = stringMap.get(balloonLetter);
                numberOfLettersInBalloon = balloonMap.get(balloonLetter);
                if (numberOfLettersInString >= numberOfLettersInBalloon) {
                    stringMap.put(balloonLetter, numberOfLettersInString - numberOfLettersInBalloon);
                } else {
                    return res;
                }
            }
            res++;
        }
        return res;
    }
    
    private HashMap<Character, Integer> getMapOfChars(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        
        return hashMap;
    }
}

package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//TODO: дорешать
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        HashMap<Character, List<Integer>> hashMap = new HashMap<>();
        char[] arr = s.toCharArray();
        HashSet<Character> elementsToRemove = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], new ArrayList<>(List.of(i)));
            } else {
                List<Integer> list = hashMap.get(arr[i]);
                list.add(i);
                hashMap.put(arr[i], list);
                elementsToRemove.add(arr[i]);
            }
        }
        
        for (Character elementToRemove : elementsToRemove) {
            hashMap.remove(elementToRemove);
        }
        
        if (hashMap.isEmpty()) {
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        for (Character character : hashMap.keySet()) {
            if (hashMap.get(character).get(0) < min) {
                min = hashMap.get(character).get(0);
            }
        }
        return min;
    }
}

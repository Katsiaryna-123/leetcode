package problems;

import java.util.HashMap;

public class LeastInterval {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char task : tasks) {
            if (!hashMap.containsKey(task)) {
                hashMap.put(task, 1);
            } else {
                hashMap.put(task, hashMap.get(task) + 1);
            }
        }
        
        int maxFrequency = 1;
        int numberOfTopElements = 0;
        for (Character key : hashMap.keySet()) {
            if (hashMap.get(key) > maxFrequency) {
                maxFrequency = hashMap.get(key);
            }
        }
        
        for (Character key : hashMap.keySet()) {
            if (hashMap.get(key).equals(maxFrequency)) {
                numberOfTopElements = numberOfTopElements + 1;
            }
        }
        int possibleRes = (n + 1) * (maxFrequency - 1) + numberOfTopElements;
        int finalRes = Math.max(tasks.length, possibleRes);
        
        return finalRes;
    }
}

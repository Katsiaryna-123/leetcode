package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int candidate : candidates) {
            hashSet.add(candidate);
        }
        
        hashSet.add(0);
        HashSet<List<Integer>> resultingHashset = new HashSet<>();
        
        for (int candidate : candidates) {
            int possible = target;
            int iteration = 0;
            while (possible >= 0) {
                List<Integer> sum = new ArrayList<>();
                possible = possible - candidate;
                iteration++;
                if (hashSet.contains(possible) && possible != candidate) {
                    if (possible != 0) {
                        sum.add(possible);
                    }
                    for (int j = 0; j < iteration; j++) {
                        sum.add(candidate);
                    }
                    Collections.sort(sum);
                    if (!resultingHashset.contains(sum)) {
                        resultingHashset.add(sum);
                        result.add(sum);
                    }
                }
            }
        }
        
        return result;
        
    }
}

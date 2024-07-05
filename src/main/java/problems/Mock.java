package problems;

import java.util.HashMap;
import java.util.List;

public class Mock {
    public List<Integer> getSum(int[] arr, int sum) throws Exception {
        HashMap<Integer, List<Integer>> values = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!values.containsKey(arr[i])) {
                values.put(arr[i], List.of(i));
            } else {
                values.get(arr[i]).add(i);
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i];
            if (arr[i] == target) {
                if (values.get(target).size() > 1) {
                    List<Integer> correctIndexes = values.get(target);
                    return List.of(correctIndexes.get(0), correctIndexes.get(1));
                }
            } else {
                if (values.containsKey(target)) {
                    return List.of(i, values.get(target).get(0));
                }
            }
        }
        throw new Exception(String.format("No elements to get sum %s were found", sum));
    }
}

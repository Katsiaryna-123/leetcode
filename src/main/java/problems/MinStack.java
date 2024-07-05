package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MinStack {
    private final List<Integer> list;
    private final List<Integer> minValues;
    
    public MinStack() {
        this.list = new ArrayList<>();
        this.minValues = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        if (!minValues.isEmpty()) {
            if (val <= minValues.get(minValues.size() - 1)) {
                minValues.add(val);
            }
        } else {
            minValues.add(val);
        }
    }
    
    public void pop() {
        Integer removed = top();
        list.remove(list.size() - 1);
        if (Objects.equals(minValues.get(minValues.size() - 1), removed)) {
            minValues.remove(minValues.size() - 1);
        }
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        return minValues.get(minValues.size() - 1);
    }
}

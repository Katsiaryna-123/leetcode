package problems;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public List<List<Integer>> insert(int[][] intervals, int[] newInterval) {
        int startOfNew = newInterval[0];
        int endOfNew = newInterval[1];
        List<List<Integer>> result = new ArrayList<>();
        boolean isOverlapping = true;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < endOfNew && intervals[i][1] > startOfNew) {
                isOverlapping = true;
                int start = Math.min(intervals[i][0], startOfNew);
                int end = Math.max(intervals[i][1], endOfNew);
                for (int j = i + 1; j < intervals.length; j++) {
                    while (end > intervals[j][0]) {
                        end = intervals[j][0];
                    }
                }
                List<Integer> overlaping = new ArrayList<>();
                overlaping.add(start);
                overlaping.add(end);
                
                result.add(overlaping);
            } else {
                isOverlapping = false;
                List<Integer> notOverlaping = new ArrayList<>();
                notOverlaping.add(intervals[i][0]);
                notOverlaping.add(intervals[i][1]);
                result.add(notOverlaping);
            }
        }
        return result;
    }
}

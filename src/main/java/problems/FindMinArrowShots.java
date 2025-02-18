package problems;

import java.util.Arrays;

class FindMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int res = 1;
        int previousEnd = points[0][1];
        
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > previousEnd) {
                res = res + 1;
                previousEnd = points[i][1];
            }
        }
        
        return res;
    }
}
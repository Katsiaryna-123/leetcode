package problems;

import java.util.HashMap;

class PivotInteger {
    public int pivotIntegerBinarySearch(int n) {
        int rightBound = n;
        int leftBound = 1;
        int sum = (n * (n + 1)) / 2;
        if (rightBound == leftBound) {
            return rightBound;
        }
        int rightSum;
        int leftSum;
        while (leftBound < rightBound) {
            int mid = (leftBound + rightBound) / 2;
            leftSum = (mid * (mid + 1) / 2);
            rightSum = sum - leftSum + mid;
            if (leftSum == rightSum) {
                return mid;
            } else if (leftSum < rightSum) {
                leftBound = mid + 1;
            } else {
                rightBound = mid - 1;
            }
        }
        return -1;
    }
}
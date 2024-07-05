package problems;

public class MockFromIvan {
    public int maxProfit(int[] prices) {
        int right = 1;
        int maxProfit = 0;
        int min = prices[0];
        
        while (right < prices.length) {
            min = Math.min(min, prices[right]);
            maxProfit = Math.max(maxProfit, prices[right] - min);
            right++;
        }
        return maxProfit;
    }
}

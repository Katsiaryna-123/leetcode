package problems;

public class BestTimeToBuyAndSellStocks1 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 1;
        
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                int maybe = prices[right] - prices[left];
                profit = Math.max(profit, maybe);
                right++;
            } else {
                left++;
                right = left + 1;
            }
        }
        return profit;
    }
    
    public int maxProfitDP(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        
        
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }
        
        return maxProfit;
    }
}

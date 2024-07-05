package problems;

public class BestTimeToBuyAndSellStocksWithCooldown {
    //TODO: reshi
    
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        for (int i = 1; i <= prices.length - 1; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + prices[i] - prices[i - 1];
            } else {
                i++;
            }
        }
        
        return profit;
    }
}

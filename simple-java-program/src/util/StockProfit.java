package util;

public class StockProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0; // No prices available, so no profit
        }

        int minPrice = Integer.MAX_VALUE; // Initially set to a very large number
        int maxProfit = 0; // Initially set to 0 since no transaction is made

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minPrice if a lower price is found
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update maxProfit if a higher profit is found
            }
        }

        return maxProfit; // Return the maximum profit
    }
}

/*
 class Solution {
    int profit = 0;
    public int solve(int i, int buy, int[] prices) {
        if(i >= prices.length) {
            return 0;
        }
        if(buy == 1) {
            profit = Math.max(solve(i + 1, 0, prices) - prices[i], solve(i + 1, 1, prices));
        }
        else {
            profit = Math.max(solve(i + 2, 1, prices) + prices[i], solve(i + 1, 0, prices));
        }
        return profit;
    }
    public int maxProfit(int[] prices) {
        return solve(0, 1, prices);
    }
}
 */


 /*
  class Solution {
    int profit = 0;
    public int solve(int i, int buy, int[] prices, int[][] dp) {
        if(i >= prices.length) {
            return 0;
        }
        if(dp[i][buy] != -1) {
            return dp[i][buy];
        }
        if(buy == 1) {
            profit = Math.max(solve(i + 1, 0, prices, dp) - prices[i], solve(i + 1, 1, prices, dp));
        }
        else {
            profit = Math.max(solve(i + 2, 1, prices, dp) + prices[i], solve(i + 1, 0, prices, dp));
        }
        return dp[i][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int i = 0; i < prices.length; i++) {
            for(int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, 1, prices, dp);
    }
}
  */
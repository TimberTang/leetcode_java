/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                if (prices[i] - buy > profit) {
                    profit = prices[i] - buy;
                }
            }else {
                buy = prices[i];
            }
        }
        return profit;
    }
}


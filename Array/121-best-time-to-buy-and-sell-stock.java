class Solution {
    // 
    /* 
     ! brute force *
     * keep track of the max to the right 
     * and sell it on that day
     * for each day
     */
    // public int maxProfit(int[] prices) {
    //     int n = prices.length;
    //     int rightMax[] = new int[n];
    //     int max = Integer.MIN_VALUE;
    //     for (int i = n - 1; i >= 0; i--) {
    //         max = Math.max(max, prices[i]);
    //         rightMax[i] = max;
    //     }

    //     int maxProfit = 0;
    //     // Buy everyday and sell on the max profit time
    //     for (int i = 0; i < n; i++)
    //         maxProfit = Math.max(maxProfit, rightMax[i] - prices[i]);
    //     return maxProfit;
    // }
    
    // optimal approach
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int n = prices.length;
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // sell each day
            min = Math.min(prices[i], min);
            ans = Math.max(prices[i] - min,ans);
        }
        return ans;
    }
}
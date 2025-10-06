class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //BRUTE FORCE APPROACH

        // for(int i = 0; i < n; i++) {
        // // int profit = 0;
        // for(int j = i + 1; j < n; j++) {
        // if (prices[j] > prices[i]) {
        // maxProfit = Math.max(prices[j] - prices[i], maxProfit);
        // }
        // }
        // // maxProfit = Math.max(maxProfit, profit);
        // }
        // return maxProfit;

        //  int maxPro = 0;
        // int minPrice = Integer.MAX_VALUE;
        // for (int i = 0; i < n; i++) {
        //     minPrice = Math.min(minPrice, prices[i]);
        //     maxPro = Math.max(maxPro, prices[i] - minPrice);
        // }
        // return maxPro;

       int maxPro = 0;
       int minPrice = Integer.MAX_VALUE;
       for(int i = 0; i < prices.length; i++) {
        minPrice = Math.min(minPrice, prices[i]);
        maxPro = Math.max(maxPro, prices[i] - minPrice);
       }
       return maxPro;
    }
}
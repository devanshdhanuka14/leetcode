class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int low = 0;
        int x = 0;
        int y = 0;
        int profit = 0;

        for(int right = 1; right<prices.length;right++){
            if(prices[right]<min){
                min = prices[right];
                max = prices[right];
                x=right;
            }
            else if(prices[right]>max){
                max = prices[right];
                y=right;
            }
            profit = Math.max(max-min,profit);
        }
        return profit;
    }
}      
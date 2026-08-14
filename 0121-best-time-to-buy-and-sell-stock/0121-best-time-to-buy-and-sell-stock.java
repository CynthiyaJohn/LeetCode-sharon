class Solution {
  public int maxProfit(int[]prices) {
        int profit=0;
        int bestbuy=prices[0];
        for(int i=1;i<prices.length;i++){
            int curprice=prices[i];
            if(curprice>bestbuy){
                profit= Math.max(profit,curprice-bestbuy);
            }
            bestbuy=Math.min(bestbuy,curprice);
        }
        return profit;
    }
};
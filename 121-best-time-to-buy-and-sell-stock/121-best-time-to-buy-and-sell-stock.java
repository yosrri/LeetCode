class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int left=0, right=1; right<prices.length;){
            if(prices[right]<prices[left]){
                left=right;
                right++;
            }
            else{
                maxProfit= Math.max(prices[right]-prices[left],maxProfit);
                right++;
            }
        }
        return maxProfit;
    }
    
    }

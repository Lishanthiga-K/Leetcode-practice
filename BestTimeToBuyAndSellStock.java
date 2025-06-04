class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, i=0,diff = 0,j=1;
        while(j<prices.length){
            if(prices[i]>prices[j]){
                i = j;
            }
            else{
                diff = prices[j] - prices[i];
                if(diff>max){
                    max = diff;
                }
            }
            j++;
        }
        return max;
    }
}

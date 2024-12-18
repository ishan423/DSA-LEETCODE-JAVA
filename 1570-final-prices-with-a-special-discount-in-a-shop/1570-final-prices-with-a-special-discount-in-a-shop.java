class Solution {
    public int[] finalPrices(int[] prices) {
        // int i = 0;
        // int j = 1;
        int [] dis = prices.clone();
       
       for(int i = 0;i<prices.length;i++){
        for(int j = i+1;j<prices.length;j++){
            if(prices[i]>=prices[j]){
                dis[i] = prices[i] - prices[j]; 
                break;
            }
        }
       }
        return dis;
    }
}
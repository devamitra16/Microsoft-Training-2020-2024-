class Solution {
    public int maxProfit(int[] prices) {
       int buy=prices[0],sell,maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                sell=prices[i];
                maxProfit=Math.max(maxProfit,sell-buy);
            }
        }
        return maxProfit;
    }
}



*******************************************************************************************************************************************************************
//kadane's algorithm

class Solution {
    public int maxProfit(int[] prices) {
        int[] ans=new int[prices.length];
        ans[0]=0;
        for(int i=1;i<prices.length;i++){
            ans[i]=prices[i]-prices[i-1];

        }
        int max=Integer.MIN_VALUE,sum=0;
        for(int val:ans){
            sum+=val;
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}

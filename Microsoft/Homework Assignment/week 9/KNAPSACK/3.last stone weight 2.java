class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int total=0;
        for(int i:stones){
            total+=i;
        }
        boolean[] dp=new boolean[total/2+1];
        dp[0]=true;
        int maxS2=0;
        for(int stone:stones){
            boolean[] temp=dp.clone();
            for(int sum=stone;sum<=total/2;sum++){
                if(dp[sum-stone]){
                    temp[sum]=true;
                    maxS2=Math.max(maxS2,sum);
                    if(maxS2==total) return total-maxS2*2;
                }
            }
            dp=temp;
        }
        return total-maxS2*2;
    }
}

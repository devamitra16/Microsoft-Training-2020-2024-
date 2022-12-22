class Solution {
    public int countOrders(int n) {
        int mod=1000000007;
        long[] dp=new long[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            long oddnum=2l*i-1;
            long perm=(oddnum*(oddnum+1))/2l;
            dp[i]=((dp[i-1]%mod)*(perm%mod))%mod;
        }
        return (int) dp[n];
    }
}

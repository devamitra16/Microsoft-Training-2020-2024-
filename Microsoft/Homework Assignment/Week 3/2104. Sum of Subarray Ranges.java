class Solution {
    public long subArrayRanges(int[] nums) {
        int l=nums.length;
        
        long ans=0;
        for(int i=0;i<l;i++){
            int smin=Integer.MAX_VALUE;
            int smax=Integer.MIN_VALUE;
            for(int j=i;j<l;j++){
                smin=Math.min(smin,nums[j]);
                smax=Math.max(smax,nums[j]);
                ans+=(smax-smin);
            }
        }
        return ans;
        
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=nums.length;
        int res=Integer.MAX_VALUE;
        int left=0,sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            while(sum>=target){
                res=Math.min(res,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (res!=Integer.MAX_VALUE)?res:0;
    }
}

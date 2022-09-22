class Solution {
    public int[] getConcatenation(int[] nums) {
       int l=nums.length;
        int c=0;
        int j=0;
        int[] ans=new int[2*l];
        for(int i=0;i<l;i++){
            ans[j++]=nums[i];
            if(i==l-1 && c==0){
                c++;
                i=-1;
            }
        }
        return ans;
    }
}

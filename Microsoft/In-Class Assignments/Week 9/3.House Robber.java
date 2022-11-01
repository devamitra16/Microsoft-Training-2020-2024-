//  recursion memo

class Solution {
    int[] memo;
    public int rob(int[] nums) {
        int n=nums.length;
        memo=new int[n+1];
        Arrays.fill(memo,-1);
        return recursion(nums,nums.length-1);
    }
    public int recursion(int[] nums,int i){
        if(i<0){
            return 0;
        }
        if(memo[i]>=0){
            return memo[i];
        }
        int result=Math.max(recursion(nums,i-2)+nums[i],recursion(nums,i-1));
        memo[i]=result;
        return result;
    }
}

********************************************************************************************************************************************************************

//iterative memo

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] memo=new int[n+2];
        memo[0]=0;
        memo[1]=nums[0];
        for(int i=1;i<n;i++){
            memo[i+1]=Math.max(nums[i]+memo[i-1],memo[i]);

        }
        return memo[n];
    }
}


***********************************************************************************************************************************************************

//iterative without using array only using two variables p1 and p2

class Solution {
    public int rob(int[] nums) {
       int p1=0,p2=0;
       for(int num:nums){
           int temp=p1;
           p1=Math.max(p2+num,p1);
           p2=temp;
       } 
       return p1;
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
         for(int i=0;i<len;i++){
             int element=nums[i];
             if(element>=1 && element <len){
                 int chair=element-1;
                 if(nums[chair]!=element){
                     int temp=nums[i];
                     nums[i]=nums[chair];
                     nums[chair]=temp;
                     i--;
                 }
             }
         }
         for(int i=0;i<len;i++){
             if(i+1!=nums[i]){
                 return i+1;
             }
         }
        return len+1;
       
    }
}

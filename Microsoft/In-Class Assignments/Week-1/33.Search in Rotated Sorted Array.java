class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int start=0,end=len-1;
        int mid=len/2;
        while(start<=end && mid>=0 && mid<=len-1){
            //System.out.println(start+" "+end+" "+mid);
            if(nums[start]==target){

                return start;
            }
            if(nums[end]==target){
                return end;
            }
            if(nums[mid]==target){
                return mid;
            }
            // if(start==mid){
            //     return -1;
            // }
            if(nums[start]<nums[mid]){
                if(nums[start]<target && nums[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[mid]<target && nums[end]>target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            mid=(start+end)/2;
           //System.out.println(start+" "+end+" "+mid);
            //return 0;
        }
        return -1;
    }
}

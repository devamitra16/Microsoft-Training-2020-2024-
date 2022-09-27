class Solution {
    public int[] sortArray(int[] nums) {
       int len=nums.length;
       if(len==0){
           return nums;
       }
        mergesort(nums,0,len-1);
        return nums;
    }
    public void mergesort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,r);
        merge(nums,l,r);
    }
    private void merge(int[] nums,int l,int r){
        int mid=l+(r-l)/2;
        int[] temp=new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        for(;i<=mid;i++){
            temp[k++]=nums[i];
        }
        for(;j<=r;j++){
            temp[k++]=nums[j];
        }
        System.arraycopy(temp,0,nums,l,r-l+1);
    }
}

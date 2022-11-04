class NumArray {
    int[] sum;

    public NumArray(int[] nums) {
          sum=new int[nums.length];
          sum[0]=nums[0];
          for(int i=1;i<nums.length;i++){
              sum[i]=nums[i]+sum[i-1];
          }
    }
    
    public int sumRange(int left, int right) {
        return left==0?sum[right]:sum[right]-sum[left-1];
    }
}

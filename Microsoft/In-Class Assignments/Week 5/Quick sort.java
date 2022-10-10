class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        quicksort(nums,0,nums.length-1);
        return nums;
    }
    void quicksort(int[] arr,int l,int r){
    if(l<r){
     
      int mid=partition(arr,l,r);
      quicksort(arr,l,mid-1);
      quicksort(arr,mid+1,r);
    }
  }
   int partition(int[] arr,int l,int r){
    int pivot=arr[l];
    int i=l,j=r;
    while(i<j){
      while(arr[i]<=pivot && i<r){
        i++;
      }
      while(arr[j]>pivot && j>0){
        j--;
      }
      if(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    arr[l]=arr[j];
    arr[j]=pivot;
    return j;
  }
}

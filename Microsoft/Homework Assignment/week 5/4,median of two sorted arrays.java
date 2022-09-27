class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int l=l1+l2;
        //System.out.println(l+" "+l/2);
        int[] arr=new int[l];
        int k=0;
//         for(int i=0;i<l1;i++){
//             arr[k++]=nums1[i];
//         }
        
//         for(int j=0;j<l2;j++){
//             arr[k++]=nums2[j];
//         }
//         Arrays.sort(arr);
        int i=0,j=0;
        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i];
                i++;
            }else{
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i<l1){
            arr[k++]=nums1[i];
            i++;
        }
        while(j<l2){
            arr[k++]=nums2[j];
            j++;
        }
        double d;
        int r=l/2;
        //System.out.println(r+" "+arr[r-1]);
        if(l%2 ==0){
            d=(arr[r-1]+arr[r])/2.0000;
            return d;
        }
        d=arr[r];
        return d;
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
       int len=heights.length;
       if(len==1){
           return heights[0];
       }
        int[] left=new int[len];
        int[] right=new int[len];
        left[0]=-1;
        right[len-1]=len;
        for(int i=1;i<len;i++){
            int temp=i-1;
            while(temp>=0 && heights[temp]>=heights[i]){
                temp=left[temp];
            }
            left[i]=temp;
        }
        for(int j=len-2;j>=0;j--){
            int temp=j+1;
            while(temp<len && heights[temp]>=heights[j]){
                temp=right[temp];
            }
            right[j]=temp;
        }
        int max=0;
        for(int i=0;i<len;i++){
           max=Math.max(max,heights[i]*(right[i]-left[i]-1));
        }
        return max;
        
    }
}

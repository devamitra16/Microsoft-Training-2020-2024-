class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int pow=1;
        for(int i=1;i<=n;i++){
            if(pow*2==i){
                ans[i]=1;
                pow*=2;
            }else{
                ans[i]=1+ans[i-pow];
            }
        }
        return ans;
    }
}

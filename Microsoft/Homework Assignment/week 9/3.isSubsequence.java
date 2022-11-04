class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int[][] lcs=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            for(int j=0;j<=l2;j++){
                if(i==0||j==0){
                    lcs[i][j]=0;
                }
                else if(s.charAt(i-1)==t.charAt(j-1)){
                    lcs[i][j]=1+lcs[i-1][j-1];
                }else{
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        
        return lcs[l1][l2]==l1;

    }
}

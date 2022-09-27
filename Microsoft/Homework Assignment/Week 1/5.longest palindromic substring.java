class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0,end=0;
        int[][] dp=new int[n][n];
        for(int diff=0;diff<n;diff++){
            for(int i=0,j=i+diff;j<n;j++,i++){
             
                if(i==j){
                    dp[i][j]=1;
                }else if(j-i==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;
                        start=i;
                        end=j;
                    }
                }
                else if(diff>1 && s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    start=i;
                    end=j;
                    
                }
            }
        }
       
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //System.out.println(start+" "+end);
        
        return s.substring(start,end+1);
    }
}

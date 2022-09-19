class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch!='.'){
                    if(set.contains(ch+"_r_"+i)|| set.contains(ch+"_c_"+j)||set.contains(ch+"_b_"+i/3+"_"+j/3)){
                        return false;
                    }else{
                        set.add(ch+"_r_"+i);
                        set.add(ch+"_c_"+j);
                        set.add(ch+"_b_"+i/3+"_"+j/3);
                    }
                }
            }
        }
        return true;
    }
}

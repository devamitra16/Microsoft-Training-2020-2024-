class Solution {
    Map<String,Boolean> map=new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int n=s1.length();
        return func(s1,s2,n);
    }
    public boolean func(String s1,String s2,int n){
        if(s1.equals(s2)){
           map.put(s1+"#"+s2,true);
            return true;
        }
        else if(s1.length()==1){
            return false;
        }
        else if(map.containsKey(s1+"#"+s2)){
            return map.get(s1+"#"+s2);
        }
        for(int k=1;k<=n-1;k++){
            boolean cond1=func(s1.substring(0,k),s2.substring(0,k),k) &&func(s1.substring(k,n),s2.substring(k,n),n-k);
            boolean cond2=func(s1.substring(0,k),s2.substring(n-k,n),k) && func(s1.substring(k,n),s2.substring(0,n-k),n-k);
            if(cond1|| cond2){
                map.put(s1+"#"+s2,true);
                return true;
            }
        }
        map.put(s1+"#"+s2,false);
        return false;
        
    }
}

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len=s.length();
        HashSet<String> set1=new HashSet<>();
       HashSet<String> set2=new HashSet<>();
      
        for(int i=0;(i+9)<len;i++){
            if(!set1.contains(s.substring(i,i+10))){
            set1.add(s.substring(i,i+10));
            }else{
                if(!set2.contains(s.substring(i,i+10))){
                    set2.add(s.substring(i,i+10));
                    
                }
            }
        }
        return new ArrayList(set2);
    }
}

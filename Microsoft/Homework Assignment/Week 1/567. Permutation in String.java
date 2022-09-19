import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2){
            return false;
            
        }
        int left=0,right=0;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        while(right<l1){
            freq1[s1.charAt(right)-'a']+=1;
            freq2[s2.charAt(right)-'a']+=1;
            right+=1;
        }
        right-=1;
        while(right<l2){
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
            right+=1;
            if(right!=l2){
                freq2[s2.charAt(right)-'a']+=1;
                freq2[s2.charAt(left)-'a']-=1;
                //System.out.println(s2.charAt(right)+" "+s2.charAt(left));
                left+=1;
            }
        }
        return false;
    }
}

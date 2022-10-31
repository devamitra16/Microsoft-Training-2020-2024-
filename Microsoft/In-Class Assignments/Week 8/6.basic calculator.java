class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int len=s.length();
        int ans=0;
        int sign=1;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            
            if(ch>='0' && ch<='9'){
                int num=0;
                while(i<len && s.charAt(i)>='0'&& s.charAt(i)<='9'){
                    num=num*10+(s.charAt(i))-'0';
                    
                    i++;
                }
                ans+=num*sign;
             
                i--;
            }
            else if(ch=='+'){
                sign=1;
            }else if(ch=='-'){
                sign=-1;
            }else if(ch=='('){
                
                stack.push(ans);
                stack.push(sign);
                ans=0;
                sign=1;
                
            }else if(ch==')'){
                ans=stack.pop()*ans;
                ans+=stack.pop();
             

            }

        }
        return ans;
    }

}

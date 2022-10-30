class Solution {
    public int calculate(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int len=s.length();
        Stack<Integer> stack =new Stack<Integer>();
        int currentNumber=0;
        char operation='+';
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                currentNumber=(currentNumber*10)+(ch-'0');
            }
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i==len-1){
                if(operation=='+'){
                    stack.push(currentNumber);
                }
                if(operation=='-'){
                    stack.push(-currentNumber);
                }
                if(operation=='*'){
                    stack.push(currentNumber*stack.pop());
                }
                if(operation=='/'){
                    stack.push(stack.pop()/currentNumber);
                }
                operation=ch;
                currentNumber=0;
            }

        }
        int ans=0;
        while(!stack.isEmpty()){
           ans+=stack.pop();
        }
        return ans;
        
    }
}

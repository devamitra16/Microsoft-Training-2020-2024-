class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int a;
        int b=0;
            while(x!=0)
            {
                a = x%10;
                x = x/10;
                b = a+(b*10);
            }
        return (Math.abs(b) == n);
    }         
}

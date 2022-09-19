class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String str2="";
        String[] str1=new String[str.length];
        for(int i=0;i<str.length;i++){
            int temp=(str[i].charAt((str[i].length())-1))-'0';
            str1[temp-1]=str[i];
        }
        for(int i=0;i<str1.length;i++){
            str2+=str1[i].substring(0,str1[i].length()-1);
            if(i!=(str1.length)-1){
                str2+=" ";
            }
        }
        return str2;
    }
}

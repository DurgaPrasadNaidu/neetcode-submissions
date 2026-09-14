class Solution {
    public String mergeAlternately(String word1, String word2) {
       int maxLength=0;
       int wLen=word1.length();
       int w2Len=word2.length();
        maxLength=Math.max(wLen,w2Len);
       int i=0;
       int j=0;
       StringBuilder str= new StringBuilder();
       while(i<wLen && j<w2Len){
          
          str.append(word1.charAt(i));
          i++;
          str.append(word2.charAt(j));
          j++;
        


       }

       if(wLen>w2Len){
        str.append(word1.substring(i,wLen));
       }else{
           str.append(word2.substring(j,w2Len));
       }

       return str.toString();
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        Set<Character> window=new HashSet<>();  
        int left=0;
        int maxLen=0;
        for(int i=0
        ;i<s.length();i++){
          
          while(window.contains(s.charAt(i))){
            window.remove(s.charAt(left));
            left++;
          }
         window.add(s.charAt(i));
            
            int currentlength=i-left+1;
            maxLen=Math.max(currentlength,maxLen);
        }

        return maxLen;
    }
}

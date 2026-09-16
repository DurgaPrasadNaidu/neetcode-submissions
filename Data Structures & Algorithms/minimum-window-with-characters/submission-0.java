class Solution {
    public String minWindow(String s, String t) {
       if(s.length()<t.length()) return "";
        int [] tMap=new int[128];
        int [] sMap=new int[128];

        for(char ch:t.toCharArray()){
            tMap[ch]++;
        }

        int start=0; int left=0;
        int minLen= Integer.MAX_VALUE;

        for(int right=0; right<s.length();right++){

            sMap[s.charAt(right)]++;

            while(hasRequiredFrequency(tMap,sMap)){
                int currentLength=right-left+1;
                if(currentLength<minLen){
                minLen=Math.min(minLen,right-left+1);
                start=left;
                }

                sMap[s.charAt(left)]--;
                left++;

            }

        }
        
            return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }

    boolean hasRequiredFrequency(int [] tMap,int [] sMap){

        for(int i=0;i<128;i++){

            if(sMap[i]<tMap[i]){
                return false;
            }
        }
        return true;
    }
}

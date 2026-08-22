class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end=0;

for(int pile:piles){
    end=Math.max(end,pile);
}

while(start<=end){

    int mid=start+(end-start)/2;
    long hours=0;

    for(int pile:piles){
        hours+=(long)Math.ceil((double)pile/mid);
    }

    if(hours<=h){
        end=mid-1;
    }else{
        start=mid+1;
    }
}
   return start;     
    }
}

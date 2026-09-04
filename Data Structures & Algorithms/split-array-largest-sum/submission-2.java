class Solution {
    public int splitArray(int[] nums, int k) {

        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++){

          start=Math.max(start,nums[i]);
          end+=nums[i];
        }
       
        while(start<end){
          int sum=0;
         int subArrayPieces=1;
         int mid=start+(end-start)/2;

         for(int i=0;i<nums.length;i++){
            
            if(sum +nums[i]>mid){
                sum=nums[i];
                subArrayPieces++;
            }else{
                sum+=nums[i];
            }

         }

         if(subArrayPieces >k){

         start=mid+1;

         }else{
            end=mid;
         }

        }
       return start; 
    }
}
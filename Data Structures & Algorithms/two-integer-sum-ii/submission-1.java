class Solution {
    public int[] twoSum(int[] nums, int target) {

      int start=0;
      int end=nums.length-1;
       int sum=0;
      for(int i=0;i<nums.length;i++){
          
          sum=nums[start]+nums[end];

          if(sum==target){
            return new int[] {start+1,end+1};
          }
        
        if(sum >target){
            end--;
        }else{
            start++;
        }

      }

      return new int []{-1,-1};

    }
}

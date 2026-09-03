class Solution {
    public int firstMissingPositive(int[] nums) {
      int n=nums.length;

      for(int i=0;i<nums.length;i++){
          if(nums[i]>n || nums[i]<=0){
            nums[i]=n+1;
          }
      }

          for(int i=0;i<n;i++){
            int value=Math.abs(nums[i]);

            if(value>=1 && value<=n){
                int index=value-1;
            
            if(nums[index] >0){
                nums[index]=-nums[index];
            }
          }
          }

          for(int i=0;i<n;i++){
         if(nums[i]>0){
            return i+1;
         }

          }
      

        return n+1;
    }
}
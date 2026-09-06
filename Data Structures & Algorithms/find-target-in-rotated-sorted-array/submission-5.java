class Solution {
    public int search(int[] nums, int target) {
        
        

        int pivot= findPivot(nums);

        if(pivot!=-1 && nums[pivot]==target){
           return pivot;
        }else if(pivot==-1){
            return findBinarySearch(nums,0,nums.length-1,target);
        }

        if(target >= nums[0]){
 return findBinarySearch(nums,0,pivot-1,target);
            
        }
       return findBinarySearch(nums,pivot+1,nums.length-1,target);
    }

      int findPivot(int[] nums){

        int start=0;
        int end=nums.length-1;
         
        while(start<=end){

            int mid=start+(end-start)/2;

              if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
              }else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
              }
              else if(nums[start] > nums[mid]){
                end=mid-1;
              }else{
                start=mid+1;
              }
        }
        return -1;

      }

      int findBinarySearch(int [] nums, int start,int end,int target){
             
             while(start<=end){

             int mid=start+(end-start)/2;

               if(nums[mid]==target){
                return mid;
               }
               if(nums[mid]>target){
                end=mid-1;
               }else {
                start=mid+1;
               }
             }
            return -1;
      }

    }

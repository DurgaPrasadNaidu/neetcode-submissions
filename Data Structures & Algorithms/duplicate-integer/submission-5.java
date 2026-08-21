class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return false;
        }
        HashSet<Integer> seen=new HashSet<>();
          seen.add(nums[0]);
        for(int i=1;i<nums.length;i++){
             
            if(seen.contains(nums[i])){
                return true;
            }else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
}
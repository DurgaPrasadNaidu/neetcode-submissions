class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return false;
        }
        HashMap<Integer, Integer> seen=new HashMap<>();
          seen.put(0,nums[0]);
        for(int i=1;i<nums.length;i++){
             
            if(seen.containsValue(nums[i])){
                return true;
            }else{
                seen.put(i,nums[i]);
            }
        }
        return false;
    }
}
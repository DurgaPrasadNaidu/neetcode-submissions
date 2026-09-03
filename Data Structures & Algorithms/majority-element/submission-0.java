class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        for(int keys:map.keySet()){
            if(map.get(keys) > nums.length/2){
                ans=keys;
            }
        }
        return ans;
    }
}
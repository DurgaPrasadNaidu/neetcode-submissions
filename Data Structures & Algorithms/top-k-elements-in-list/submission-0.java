class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
         int [] result= new int[k];
        List<Integer> [] bucket=new List[nums.length+1];
        
        Map<Integer,Integer> frequencyMap=new HashMap<>();

        for (int i=0; i<nums.length;i++){

            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i],0)+1);

        }

        for(int i:frequencyMap.keySet()){
            if(frequencyMap.get(i)!=null){
                int freqcount=frequencyMap.get(i);
                if(bucket[freqcount]==null){
                bucket[freqcount]=new ArrayList<>();
                }
                bucket[freqcount].add(i);
            }
            
        }
        
        int counter=0;
        for(int i=bucket.length-1;i>=0 && counter<k;i--){
             if(bucket[i]!=null){
            for(Integer j: bucket[i]){
              result[counter++]=j;
            }
        }
        
    }
    return result;
}
}

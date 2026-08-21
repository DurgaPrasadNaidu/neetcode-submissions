class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String,List<String>> map=new HashMap<>();
List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++){

            String orignalword=strs[i];

            char [] chararr=strs[i].toCharArray();
            Arrays.sort(chararr);
             
             String sortword= String.valueOf(chararr);
            if(!map.containsKey(sortword)){
               map.put(sortword,new ArrayList<>());
            }
            map.get(sortword).add(orignalword);
        }
        res.addAll(map.values());
        return res;
    }
}

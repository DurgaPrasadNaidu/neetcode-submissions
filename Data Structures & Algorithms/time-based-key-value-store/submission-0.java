class TimeMap {

    class Pair{

        String value;
        int timestamp;

        public Pair(String value,int timestamp){
            this.value=value;
            this.timestamp=timestamp;
        }

    }

    private Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {

        map.putIfAbsent(key,new ArrayList<>());

       map.get(key).add(new Pair(value,timestamp));
        
    }
    
    public String get(String key, int timestamp) {
        
        if(!map.containsKey(key)){
            return "";
        }

        List<Pair> list=map.get(key);

        int start=0;
        int end=list.size()-1;

        String str= "";
        while(start<=end){
            int mid=start+(end-start)/2;

            if(list.get(mid).timestamp<=timestamp){
                str=list.get(mid).value;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return str.toString();
    }
}

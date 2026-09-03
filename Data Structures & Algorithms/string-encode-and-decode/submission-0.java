class Solution {

    public String encode(List<String> strs) {

       StringBuilder str =new StringBuilder();
       for(int i=0; i<strs.size();i++) {
           
           str.append(strs.get(i).length());
           str.append('#');
             str.append(strs.get(i));

       }
       return str.toString();
    }

    public List<String> decode(String str) {
      
      List<String> result= new ArrayList<>();
      
       int i=0;

       while(i<str.length()){
        int j=i;

      while(str.charAt(j)!='#'){
          j++;
      }
      int length= Integer.parseInt(str.substring(i,j));
       int start=j+1;
       String res=str.substring(start,start+length);
       result.add(res);
       i=start+length;

       }
       return result;
    }
}

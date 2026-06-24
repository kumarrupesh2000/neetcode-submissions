class Solution {

    public String encode(List<String> strs) {
        
        
        StringBuilder encodedString=new StringBuilder();
        for(String s:strs){
            encodedString.append(s.length()).append("#").append(s);
        }
        return  new String(encodedString);
    }

    public List<String> decode(String str) {

        List<String>decodedString=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));

            String req=str.substring(j+1,len+1+j);
            decodedString.add(req);
            i=len+1+j;
        }

    return decodedString;

    }
}

class Solution {


     public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>mp1=new HashMap<>();
        Map<Character,Integer>mp2=new HashMap<>();
        

        for(Character ch:s.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        
        for(Character ch:t.toCharArray()){
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
        }

        for(Character ch:mp1.keySet()){
            if(!mp1.get(ch).equals(mp2.get(ch))){
                return false;
            }
        }
        return true;



        
        

    }

    public String sortingString(String s){
        char []ch=s.toCharArray();

        Arrays.sort(ch);
        return new String(ch);
    }
    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>>ans=new ArrayList<>();

        

        Map<String,List<String>>mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            List<String>temp=new ArrayList<>();
            for(int j=0;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){          
                       temp.add(strs[j]);
                     
                }
               
            }
            if(!mp.containsKey(sortingString(strs[i]))){
                     mp.put(sortingString(strs[i]),temp);
                }
        }

        for(String s:mp.keySet()){
                ans.add(mp.get(s));
            }

        return ans;
    }
}

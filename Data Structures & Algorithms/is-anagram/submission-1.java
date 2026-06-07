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
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer>mp=new HashMap<>();

        for(int e:nums){

            mp.put(e,mp.getOrDefault(e,0)+1);
        }

        List<Map.Entry<Integer,Integer>>li=new ArrayList<>(mp.entrySet());

        li.sort((a,b)->b.getValue()-a.getValue());

        Map<Integer,Integer>sortedMap=new LinkedHashMap<>();

        for(Map.Entry<Integer,Integer>m:li){
            sortedMap.put(m.getKey(),m.getValue());
        }


        ArrayList<Integer>temp=new ArrayList<>();

        for(int key:sortedMap.keySet()){

           temp.add(key);
        }

    
        int [] ans=new int[k];
        int i=0;
        while(k>0){
            ans[i]=temp.get(i);
            k--;
            i++;
        }
        return ans;

        
    }
}

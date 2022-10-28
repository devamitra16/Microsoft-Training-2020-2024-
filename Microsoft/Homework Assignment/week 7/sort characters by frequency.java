class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((c1,c2)->(map.get(c2)-(map.get(c1))));
        for(char c:map.keySet()){
             pq.add(c);
        } 
        
       
        StringBuilder sb=new StringBuilder();
        System.out.println(pq.size());
        while(!pq.isEmpty()){
            char c=pq.poll();
            for(int j=0;j<map.get(c);j++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}


***************************************************************************************************************************************************************

class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        
        List<Map.Entry<Character,Integer>> list=new LinkedList<Map.Entry<Character,Integer>>(map.entrySet());
        Collections.sort(list,(i1,i2)->(i2.getValue())-(i1.getValue()));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).getValue();j++){
                sb.append(list.get(i).getKey());
            }
        }
        return sb.toString();
    }
}

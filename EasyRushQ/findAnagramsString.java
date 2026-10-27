class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        
        int n = p.length();
        int m = s.length();
        
        if(n > m){
            return list;
        }
        int left = 0;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

         for(char b: p.toCharArray()){
             map2.put(b, map2.getOrDefault(b, 0) +1);
        }   

    for(int right = 0; right < m; right++){
        map1.put(s.charAt(right), map1.getOrDefault(s.charAt(right), 0)+1);
       if(right - left + 1 > n){
        map1.put(s.charAt(left), map1.get(s.charAt(left))- 1);
        if(map1.get(s.charAt(left)) == 0){
            map1.remove(s.charAt(left));
        }
        left++;
       }

       if(right - left + 1 == n && map1.equals(map2)){
            list.add(left);
       }
        

    }

    return list;


    }
}

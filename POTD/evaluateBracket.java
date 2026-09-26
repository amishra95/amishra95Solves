class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        int n = s.length();

        HashMap<String, String> map = new HashMap<>();
        
        for(List<String> k : knowledge){
            map.put(k.get(0), k.get(1));
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                int j = i+1;
                while(s.charAt(j) != ')'){
                    ++j;
                }
                String key = s.substring(i+1, j);
                sb.append(map.getOrDefault(key, "?"));
                i = j;
            }
            else{
                sb.append(s.charAt(i));
            }

        }
        
        return sb.toString();


    }
}

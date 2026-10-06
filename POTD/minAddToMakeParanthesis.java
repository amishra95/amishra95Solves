class Solution {
    public int minAddToMakeValid(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

    int countL = 0;
    int countR = 0;
    // A concataned String and Characters
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '('){
            countL++;
        }
       else if(s.charAt(i) == ')' && countL > 0){
            countL--;
        }
        else{
            countR++;
        }

        
    }
    return countL + countR;
        
    }
}

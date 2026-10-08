class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int depth = 0;

    for(char c: s.toCharArray()){
        if(c == '('){
            if(depth != 0){
                sb.append('(');
            }
            depth++;
        }
        else{
            depth--;
            if(depth != 0){
                sb.append(')');
            }
        }
    }

    return sb.toString();
    
    }

}
// Solution 2
class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
    
    for(char c : s.toCharArray()){
        if(c == ')'){
            count--;
        }
        if(count > 0){
          sb.append(c);   
        }
        if(c == '('){
            count++;
        }


    }

    return sb.toString();

    }
}


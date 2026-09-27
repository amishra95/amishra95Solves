class Solution {
    public String reverseParentheses(String s) {
    
       StringBuilder sb = new StringBuilder();
       Stack<Character> stack = new Stack<>();
        int count = 0;

    for(char c : s.toCharArray()){
      if(c == '('){
        stack.push(c);
      }
      else if( c == ')'){
        List<Character> temp = new ArrayList<>();
         while (stack.peek() != '(') {
         temp.add(stack.pop());
        }
        stack.pop();
         for (char ch : temp) {
                    stack.push(ch); 
                }
      }
      else{
        stack.push(c);
      }
        
    }
    for (char c : stack) {
            sb.append(c);
        }
    return sb.toString();
    

    
    }

   
}

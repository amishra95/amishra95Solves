class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

    for(int i = 0; i < s.length(); i++){
       char c = s.charAt(i);
    
        if(c == '('){
            stack1.push(i);
        }
        if(c == '*'){
            stack2.push(i);
        }
        if(c == ')'){
            if(!stack1.isEmpty()){
                stack1.pop();
            }
           else if(!stack2.isEmpty()){
                stack2.pop();
            }
            else 
            return false;
        }
    }
    while(!stack1.isEmpty() && !stack2.isEmpty()){
       if(stack2.peek() < stack1.peek()){
         return false;
    }
    stack1.pop();
    stack2.pop();
  }

    return stack1.isEmpty();
    
    }
}

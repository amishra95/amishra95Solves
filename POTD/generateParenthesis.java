// Re-Do Approach Oct 10, 2026
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(list, sb, 0, 0, n);

    return list;

    }

    public void backtrack(List<String> list, StringBuilder sb, int start, int end, int max){
      //Output Parenthesis has to be of the length 2*n;
      if(sb.length() == max*2){
        list.add(sb.toString());
        return;
      }
      
      if(start < max){
        sb.append('(');
        backtrack(list, sb, start+1, end, max);
        sb.deleteCharAt(sb.length()-1);
      }

      if(end < start){
        sb.append(')');
        backtrack(list, sb, start, end+1, max);
        sb.deleteCharAt(sb.length()-1);
      }
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<>();
        backtrack(list, new StringBuilder(), 0, 0, n);
        return list;
        
    }

    public void backtrack(List<String> list, StringBuilder sb, int open, int close, int n){
       if(sb.length() == 2*n){
        list.add(sb.toString());
        return;
       }

       if(open < n){
        sb.append('(');
        backtrack(list, sb, open+1, close, n);
        sb.deleteCharAt(sb.length()-1);
       }
       if(close < open){
        sb.append(')');
        backtrack(list, sb, open, close+1, n);
        sb.deleteCharAt(sb.length()-1); 
       }
    }
}gen

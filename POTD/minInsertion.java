class Solution {
    public int minInsertions(String s) {
        int open = 0;    // unmatched '('
        int insert = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                // Need a "))" pair
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;          // consume the second ')'
                } else {
                    insert++;     // insert the missing ')'
                }

                // Match the "))" with a '('
                if (open > 0) {
                    open--;
                } else {
                    insert++;     // insert a '('
                }
            }
        }

        return insert + open * 2;
    }
}

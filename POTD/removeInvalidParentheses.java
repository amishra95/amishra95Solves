class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new ArrayList<>();
        int leftRem = 0;
        int rightRem = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftRem++;
            } else if (s.charAt(i) == ')') {
                if (leftRem > 0) {
                    leftRem--;
                } else {
                    rightRem++;
                }
            }
        }

        backtrack(s, list, 0, leftRem, rightRem);
        return list;
    }

    public void backtrack(String s, List<String> list, int start, int leftRem, int rightRem) {
        if (leftRem == 0 && rightRem == 0) {
            if (isValid(s)) {
                list.add(s);
            }
            return;
        }

        for (int i = start; i < s.length(); i++) {
            // skip duplicates: removing either of two identical neighbours gives the same string
            if (i > start && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            char c = s.charAt(i);
            String removed = s.substring(0, i) + s.substring(i + 1);

            if (c == '(' && leftRem > 0) {
                backtrack(removed, list, i, leftRem - 1, rightRem);
            } else if (c == ')' && rightRem > 0) {
                backtrack(removed, list, i, leftRem, rightRem - 1);
            }
        }
    }

    public boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}

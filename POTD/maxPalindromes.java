class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            for (int length = k; length <= k + 1; length++) {
                int start = i - length;
                if (start < 0) {
                    continue;
                }
                if (isPalindrome(s, start, i - 1)) {
                    dp[i] = Math.max(dp[i], dp[start] + 1);
                }
            }
        }
        return dp[n];
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

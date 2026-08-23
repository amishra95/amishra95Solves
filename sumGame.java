class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int firstQ = 0, firstSum = 0;
        int secondQ = 0, secondSum = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);
            if (c != '?') {
                firstSum += c - '0';   
            } else {
                firstQ++;
            }
        }

        for (int j = n / 2; j < n; j++) {
            char c = num.charAt(j);
            if (c != '?') {
                secondSum += c - '0';
            } else {
                secondQ++;
            }
        }

        int totalQ = firstQ + secondQ;
        int sumDiff = firstSum - secondSum;

       
        if (totalQ % 2 == 1) return true;

        
        return sumDiff != (secondQ - firstQ) / 2 * 9;
    }
}

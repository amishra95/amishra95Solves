class Solution {

    public int maximizeSweetness(int[] sweetness, int k) {

        int total = 0;

        for (int s : sweetness) {
            total += s;
        }

        int low = 1;
        int high = total;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;
            int count = 0;

            // check if we can make at least (k + 1) pieces
            // where each piece has sweetness >= mid
            for (int s : sweetness) {

                sum += s;

                if (sum >= mid) {
                    count++;
                    sum = 0;
                }
            }

            if (count >= k + 1) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}

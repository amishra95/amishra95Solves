class Solution {
    public boolean isConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return false;
            }
        }

        return true;
    }
}

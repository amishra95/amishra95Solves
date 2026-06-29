class Solution {
    public long maxSum(int[] nums, int k, int mul) {

        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;

        for(int i = n-1; i >= n-k; i--){
           long currentValue = nums[i];
           long op1 = currentValue;
           long op2 = currentValue * mul;
           sum += Math.max(op1, op2);
           mul--;
           }
        return sum;
        
    }
}

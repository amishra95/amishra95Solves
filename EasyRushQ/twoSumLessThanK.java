class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int totalSum = -1 ;

        while(start < end){
            int sum = nums[start] + nums[end];

            if(sum < k){
                totalSum = Math.max(totalSum, sum);
                start++;
            }
            else{
                end--;
            }

        }
        return totalSum;
    }
}

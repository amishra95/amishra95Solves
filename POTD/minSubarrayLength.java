class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int minCount = 0;
        int totalCount = Integer.MAX_VALUE;
        int sum = 0;


        for(int right = 0; right < n; right++){
           sum += nums[right];
            while(sum >= target){
                 minCount = right-left+1;
                totalCount = Math.min(minCount, totalCount);
                sum -= nums[left];
                left++;
            }
        }
        if(totalCount == Integer.MAX_VALUE){
            return 0;
        }
        else
        return totalCount;
        
    }
}

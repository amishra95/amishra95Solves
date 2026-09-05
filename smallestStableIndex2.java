class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int[] minArray = new int[nums.length];
        int[] maxArray = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            maxArray[i] = max;
        }

        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] < min){
                min = nums[i];
             }
             minArray[i] = min;
        }

        for(int i = 0; i < nums.length; i++){
            if(maxArray[i]- minArray[i] <= k){
                return i;
            }
        }

        return -1;
        
    }
}

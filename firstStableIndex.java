class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] sol = new int[nums.length];
        int[] sol2 = new int[nums.length];

    for(int i = 0; i < nums.length; i++){
        if(nums[i] > max){
            max = nums[i];
        }
        sol[i] = max;
    }

    for(int i = nums.length-1; i >= 0; i--){
        if(nums[i] < min){
            min = nums[i];
        }
         sol2[i] = min;
    }

    for(int i = 0; i < nums.length; i++){
        if(sol[i] - sol2[i] <= k){
            return i;
        }
    }

        return -1;
    }
}

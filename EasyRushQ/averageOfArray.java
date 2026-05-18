class Solution {
    public double averageOfArray(int[] nums) {
       
      int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return (double) sum/nums.length; 
       

    }
}

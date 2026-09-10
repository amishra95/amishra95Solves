class Solution {
    public boolean uniformArray(int[] nums1) {
      //Odd element and minimum number
      // Both even, means it's true
      // Both odd, means it's true
      // If both are mixed, odd-even, it's false.
     
      int min = nums1[0];
        for(int num : nums1){
            if(num < min){
                min = num;
            }
        }

        if(min %2 != 0){
            return true;
        }

        else{
            for(int num : nums1){
                if(num %2 != 0){
                    return false;
                }
            }
        }

        return true;

    }
}

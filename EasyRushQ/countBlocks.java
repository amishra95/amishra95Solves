class Solution {
    public int countBlocks(BigArray nums) {
       long n = nums.size();
               if (n == 0) return 0;

       int count = 1;

       for(int i = 1; i < n; i++){
        if(nums.at(i) != nums.at(i-1)){
            count++;
        }
       }
        return count;
        
    }
}


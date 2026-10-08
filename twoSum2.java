class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left= 0;
        int right = numbers.length-1;
        int[] array = new int[2];

        while(left <= right){
            if(numbers[left] + numbers[right] == target){
                array = new int[]{left+1, right+1};
            
                return array;
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        
        return array;
    }
}

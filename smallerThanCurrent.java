class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        
    int[] copy = Arrays.copyOf(nums, nums.length);
    Arrays.sort(copy);
        
    HashMap<Integer, Integer> map = new HashMap<>();
        
    for(int i = 0; i < copy.length; i++){
        if(!map.containsKey(copy[i])){
            map.put(copy[i], i);
        }
    }
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = map.get(nums[i]);
        }
        
        
        return result;

        
    }
}

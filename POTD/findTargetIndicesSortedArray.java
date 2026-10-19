// O(N) solution
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> list = new ArrayList<>();
        int numsEqual = 0;
        int numsSmaller = 0;

    for(int i = 0; i < nums.length; i++){
        if(nums[i] < target){
            numsSmaller++;
        }
        else if(nums[i] == target){
            numsEqual++;
        }
        else
        continue;
    }

    for(int i = numsSmaller; i < numsSmaller + numsEqual; i++){
        list.add(i);
    }
    return list;



        
    }
}
//O(log n)
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

    for(int i = 0; i < nums.length; i++){
        if(nums[i] == target){
            list.add(i);
        }
    }

    return list;
    }
}


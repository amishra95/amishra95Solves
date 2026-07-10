class Solution {
    public int[] setDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }

        for(int num:nums2){
            set2.add(num);
        }
        
        
        HashSet<Integer> set3 = new HashSet<>();

        for(int num: nums1){
            if(!set2.contains(num)){
                set3.add(num);
            }
        }
        
        for(int num : nums2){
            if(!set1.contains(num)){
                set3.add(num);
            }
        }

        int[] result = new int[set3.size()];
        int index = 0;

        for(int num: set3){
            result[index++] = num;
        }
    
    Arrays.sort(result);

    return result;
        
    }
}

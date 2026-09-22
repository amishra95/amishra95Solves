class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        
        int[] frontArray = forwardArray(arr, target);
        int[] backArray = backwardArray(arr, target);
        
        int ans = Integer.MAX_VALUE;

        
        for (int i = 0; i + 1 < n; i++) {
            if (frontArray[i] != Integer.MAX_VALUE && backArray[i + 1] != Integer.MAX_VALUE) {
                ans = Math.min(ans, frontArray[i] + backArray[i + 1]);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public int[] forwardArray(int[] arr, int target) {
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int[] frontArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int complement = prefixSum - target;
            int curr = Integer.MAX_VALUE;

            if (map.containsKey(complement)) {
                int startIndex = map.get(complement) + 1;
                curr = i - startIndex + 1;
            }

            if (i > 0) {
                frontArray[i] = Math.min(frontArray[i - 1], curr);
            } else {
                frontArray[i] = curr;
            }

            map.put(prefixSum, i);
        }

        return frontArray;
    }

    public int[] backwardArray(int[] arr, int target) {
        int suffixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, arr.length); 
        int[] backArray = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            suffixSum += arr[i];
            int complement = suffixSum - target;
            int curr = Integer.MAX_VALUE;

            if (map.containsKey(complement)) {
                int endIndex = map.get(complement) - 1;
                curr = endIndex - i + 1;
            }

            if (i < arr.length - 1) {
                backArray[i] = Math.min(backArray[i + 1], curr);
            } else {
                backArray[i] = curr;
            }

            map.put(suffixSum, i);
        }

        return backArray;
    }
}

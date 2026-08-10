class Solution {
  public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {

    int count = 0;
    int max = 0;
    HashSet<Integer> set = new HashSet<>();

    for (int b : goodNumbers) {
      set.add(b);
    }

    for (int a : nums) {
      if (set.contains(a)) {
        count++;
        max = Math.max(count, max);

      } else {
        count = 0;
      }
    }

    return max;
  }
}

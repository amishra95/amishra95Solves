import java.util.*;

class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<List<Integer>> result = new ArrayList<>();
        if (occupiedIntervals == null || occupiedIntervals.length == 0) {
            return result;
        }

        // 1. Sort intervals by start time
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. Merge overlapping or touching intervals
        List<int[]> merged = new ArrayList<>();
        int[] current = occupiedIntervals[0];
        
        for (int i = 1; i < occupiedIntervals.length; i++) {
            // They touch or overlap if next start <= current end + 1
            if (occupiedIntervals[i][0] <= current[1] + 1) {
                current[1] = Math.max(current[1], occupiedIntervals[i][1]);
            } else {
                merged.add(current);
                current = occupiedIntervals[i];
            }
        }
        merged.add(current);

        // 3. Subtract the free interval from each merged occupied interval
        for (int[] interval : merged) {
            int s = interval[0];
            int e = interval[1];

            // Case 1: Occupied interval is strictly before the free interval
            if (e < freeStart) {
                result.add(Arrays.asList(s, e));
            }
            // Case 2: Occupied interval is strictly after the free interval
            else if (s > freeEnd) {
                result.add(Arrays.asList(s, e));
            }
            // Case 3: Free interval overlaps with the occupied interval
            else {
                // If there's a valid left piece remaining
                if (s < freeStart) {
                    result.add(Arrays.asList(s, freeStart - 1));
                }
                // If there's a valid right piece remaining
                if (e > freeEnd) {
                    result.add(Arrays.asList(freeEnd + 1, e));
                }
            }
        }

        return result;
    }
}

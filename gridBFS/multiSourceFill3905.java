class Solution {

    private static final int[][] DIRECTIONS = {
            { -1, 0 }, // Up
            { 1, 0 }, // Down
            { 0, -1 }, // Left
            { 0, 1 } // Right
    };

    public int[][] colorGrid(int n, int m, int[][] sources) {

        int[][] grid = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        Arrays.sort(sources, (a, b) -> Integer.compare(b[b.length - 1], a[a.length - 1]));

        for (int[] source : sources) {
            int r = source[0];
            int c = source[1];
            int color = source[2];
            grid[r][c] = color;
            visited[r][c] = true;
            queue.offer(new int[] { r, c });
        }

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];
            int color = grid[r][c];

            for (int[] dir : DIRECTIONS) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    grid[newRow][newCol] = color;
                    queue.add(new int[]{newRow, newCol });
                }

            }

        }

        return grid;

    }
}

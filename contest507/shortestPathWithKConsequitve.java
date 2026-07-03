import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        // Edge case: single node graph requires 0 steps
        if (n == 1) return 0;
        if (k <= 0) return -1;

        long INF = Long.MAX_VALUE / 4;
        char[] labelArr = labels.toCharArray();

        // Build adjacency list cleanly
        List<List<int[]>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0]).add(new int[]{e[1], e[2]}); // {neighbor, weight}
        }

        // dist[node][consecutive_run]
        long[][] dist = new long[n][k + 1];
        for (long[] row : dist) {
            Arrays.fill(row, INF);
        }

        // PriorityQueue stores: {distance, node, consecutive_run}
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        // Base case initialization
        dist[0][1] = 0;
        pq.offer(new long[]{0, 0, 1});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];
            int run = (int) cur[2];

            // If we found a shorter path to this state already, skip processing
            if (d != dist[u][run]) continue;

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int w = edge[1];
                
                // If character matches, increment run; otherwise, reset to 1
                int newRun = (labelArr[v] == labelArr[u]) ? run + 1 : 1;
                
                // Skip if it violates the K consecutive identical character constraint
                if (newRun > k) continue;

                // Relaxation step
                if (dist[v][newRun] > d + w) {
                    dist[v][newRun] = d + w;
                    pq.offer(new long[]{dist[v][newRun], v, newRun});
                }
            }
        }

        // Find the minimum distance to the target node 'n - 1' across all valid runs
        long ans = INF;
        for (int i = 1; i <= k; i++) {
            ans = Math.min(ans, dist[n - 1][i]);
        }
        
        return ans == INF ? -1 : (int) ans;
    }
}

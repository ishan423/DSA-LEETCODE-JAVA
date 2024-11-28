class Solution {
    private static int[] DROW = {1, 0, -1, 0};
    private static int[] DCOL = {0, 1, 0, -1};
    private static int INF = Integer.MAX_VALUE >> 2;
    public int minimumObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        queue.offer(new int[] {0, 0, 0});
        int[][] distance = new int[m][n];
        for (int[] d : distance) {
            Arrays.fill(d, INF);
        }
        distance[0][0] = 0;
        
        while (!queue.isEmpty()) {
            int [] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];
            int cost = cur[2];
            if (row == m - 1 && col == n - 1) {
                return cost;
            }
            for (int k = 0; k < 4; k++) {
                int newRow = row + DROW[k];
                int newCol = col + DCOL[k];
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) {
                    continue;
                }
                int newCost = cost + grid[newRow][newCol];
                if (distance[newRow][newCol] <= newCost) {
                    continue;
                }
                distance[newRow][newCol] = newCost;
                queue.offer(new int[] {newRow, newCol, newCost});
            }
        }
        return -1;
        
        
    }
}
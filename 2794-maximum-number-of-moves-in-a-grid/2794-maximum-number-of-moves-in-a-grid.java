import java.util.*;

class Solution {
    public int maxMoves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        
        int ans = 0;
        
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                
                if (i > 0 && grid[i][j] > grid[i - 1][j - 1] && dp[i - 1][j - 1] > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
                if (i < m - 1 && grid[i][j] > grid[i + 1][j - 1] && dp[i + 1][j - 1] > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i + 1][j - 1] + 1);
                }
                if (grid[i][j] > grid[i][j - 1] && dp[i][j - 1] > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + 1);
                }
                ans = Math.max(ans, dp[i][j] - 1);
            }
        }
        
        return ans;
    }
}

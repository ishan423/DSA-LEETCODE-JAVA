class Solution {
    public int countUnguarded(int n, int m, int[][] guards, int[][] walls) {
        
        boolean[][] row = new boolean[n + 2][m + 2];
        boolean[][] col = new boolean[n + 2][m + 2]; 
        boolean[][] w = new boolean[n + 2][m + 2];


        for (int i = 0 ; i < guards.length ; i++){
            int r = guards[i][0];
            int c = guards[i][1];
            row[r + 1][c + 1] = true;
            col[r + 1][c + 1] = true;
        }

        for (int i = 0 ; i < walls.length ; i++){
            int r = walls[i][0];
            int c = walls[i][1];
            w[r + 1][c + 1] = true;
        }

        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=m ; j++){
                if (w[i][j])
                    continue;
                if (row[i][j]==true || row[i][j - 1]==true)
                    row[i][j] = true;
            }
            for (int j = m  ; j>=1 ; j--){
                if (w[i][j])
                    continue;
                if (row[i][j]==true || row[i][j + 1]==true)
                    row[i][j] = true;
            }
        }

        for (int j = 1 ; j<=m ; j++){
            for (int i = 1 ; i<=n ; i++){
                if(w[i][j])
                    continue;
                if (col[i-1][j]==true || col[i][j])
                    col[i][j] = true;
            }
            for (int i = n ; i>=1 ;i--){
                if (w[i][j])
                    continue;
                if (col[i + 1][j]==true || col[i][j])
                    col[i][j] = true;
            }
        }
        int ans =0;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=m ;j++){
                if (col[i][j] || row[i][j] || w[i][j])
                    continue;
                ans = ans + 1;
            }
        }
        return ans;
    }
}
class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [] x = new int[m];
        int [] y=new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    x[i]++;
                    y[j]++;
                }
            }
        }
        int cnt=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    if(x[i]>1||y[j]>1){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
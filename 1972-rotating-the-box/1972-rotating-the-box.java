class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] res = new char[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                res[i][j] = box[j][i];
            }
        }
        
        for(int i = 0; i < n; i++) {
            reverse(res[i]);
        }
        
        for (int j = 0; j < m; j++) {
            int spaceBottomRow = n - 1;
            for (int i = n - 1; i >= 0; i--) {
                if (res[i][j] == '*') {
                    spaceBottomRow = i - 1;
                    continue;
                }

                if (res[i][j] == '#') {
                    res[i][j] = '.';

                 res[spaceBottomRow][j] = '#';
                    spaceBottomRow--;
                }
            }
        }
        return res;
    }
    
    void reverse(char[] row) {
        int l = 0, r = row.length - 1;
        while(l < r) {
            char tmp = row[l];
            row[l] = row[r];
            row[r] = tmp;
            l++;
            r--;
        }
    }
}
class Solution {
    public int[] maximumBeauty(int[][] it, int[] qu) {
            Arrays.sort(it, (a, b) -> a[0] - b[0]);

        int n = it.length;
        int[] maxBeauty = new int[n];
        maxBeauty[0] = it[0][1];
        for (int i = 1; i < n; i++) {
            maxBeauty[i] = Math.max(maxBeauty[i - 1], it[i][1]);
        }

        int[] result = new int[qu.length];
        
        for (int i = 0; i < qu.length; i++) {
            int query = qu[i];
            int l = 0, r = n - 1;
            int answer = 0;
            while (l <= r) {
                int mid = r + (l - r) / 2;
                if (it[mid][0] <= query) {
                    answer = maxBeauty[mid];
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            result[i] = answer;
        }

        return result;
    }


 }
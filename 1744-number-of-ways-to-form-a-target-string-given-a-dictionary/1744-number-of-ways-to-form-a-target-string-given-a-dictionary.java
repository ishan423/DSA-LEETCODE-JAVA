class Solution {
    private Long[][] memo;
    private static final int MOD = (int)Math.pow(10, 9) + 7;

    public int numWays(String[] words, String target) {
        int[][] charPosCount = new int[26][words[0].length()];
        this.memo = new Long[target.length()][words[0].length()];
        for(String w : words) {
            for(int i = 0; i < w.length(); i++) {
                char c = w.charAt(i);
                charPosCount[c - 'a'][i]++;
            }
        }
        return (int)helper(target, 0, 0, charPosCount);
    }

    private long helper(String target, int i, int leftMost, int[][] charPosCount) {
        if(i == target.length()) {
            return 1;
        }
        if(i + charPosCount[0].length - leftMost < target.length()) {
            return 0;
        }
        if(memo[i][leftMost] != null) {
            return memo[i][leftMost];
        }
        long res = 0;
        for(int j = leftMost; j < charPosCount[0].length; j++) {
            if(charPosCount[target.charAt(i) - 'a'][j] != 0) {
                res += (charPosCount[target.charAt(i) - 'a'][j] * helper(target, i + 1, j + 1, charPosCount));
                res %= MOD;
            }  
        }
        return memo[i][leftMost] = res % MOD;
    }
}
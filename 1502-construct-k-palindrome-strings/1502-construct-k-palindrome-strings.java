class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        int numOdds = 0;
        for (int i : counts) {
            if (i % 2 == 1) {
                numOdds++;
            }
        }
        return numOdds <= k;
    }
}
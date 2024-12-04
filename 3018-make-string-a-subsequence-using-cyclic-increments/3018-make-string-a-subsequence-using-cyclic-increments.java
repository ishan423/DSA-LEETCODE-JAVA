class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        if (m < n)
            return false;
        int j = 0;
        for (int i = 0; i < m && j < n; i++) {
            if (str2.charAt(j) == str1.charAt(i) || str2.charAt(j) - 'a' == ((str1.charAt(i) - 'a') + 1) % 26) {
                j++;
            }
        }
        return j == n;
    }
}
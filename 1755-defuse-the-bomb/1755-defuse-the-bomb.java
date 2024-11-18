class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            for (int i = 0; i < code.length; i++) code[i] = 0;
        }
        if (k > 0) {
            int[] ans = new int[code.length];
            for (int i = 0; i < code.length; i++) {
                for (int j = i + 1; j <= i + k; j++) {
                    ans[i] += code[j % code.length];
                }
            }
            for (int i = 0; i < ans.length; i++) code[i] = ans[i];
        }
        if (k < 0) {
            int[] ans = new int[code.length];
            for (int i = 0; i < code.length; i++) {
                for (int j = i - 1; j >= i + k; j--) {
                    ans[i] += code[(j + code.length) % code.length];
                }
            }
            for (int i = 0; i < ans.length; i++) code[i] = ans[i];
        }
        return code;
    }
}
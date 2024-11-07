class Solution {
    public int largestCombination(int[] cn) {
        int[] bit = new int[24];
        for(int i = 0;i<24;i++){
            for(int j = 0;j<cn.length;j++){
                int x = cn[j];
                if((x & (1<<i))!=0){
                    bit[i]++;
                }
            }
        }
        int max = 0;
        int p = 0;
        for(int i : bit){
             p = i;
            max = Math.max(max,p);
        }
        return max;
    }
}
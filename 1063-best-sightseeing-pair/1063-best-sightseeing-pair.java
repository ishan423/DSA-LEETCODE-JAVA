class Solution {
    public int maxScoreSightseeingPair(int[] v) {
        int res = 0;
        int max = v[0]; 
        int i=0;
        for(int j=1;j<v.length;j++){
            int temp = v[j]+j;
            int tres = v[i] + v[j] +i-j;
            if(max < temp){
               max = v[j]+j;
               i=j;
            }
            if(tres > res){
                res = tres;
            }
        }     
        return res;

    }
}
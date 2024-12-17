class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] count = new int[26];
        for(char c:s.toCharArray()){
            ++count[c-'a'];
        }
        StringBuilder sb = new StringBuilder();
        int prev=-1;
        for(int i=25;i>=0;i--){
            int len=repeatLimit;
            if(count[i]<=0){
                continue;
            }
            if(prev!=-1){
                sb.append((char)(i+'a'));
                --count[i];
                i=prev+1;
                prev=-1;
                continue;
            }
            while(count[i]>0 && len>0){
                --count[i];
                --len;
                sb.append((char)(i+'a'));
            }
            if(count[i]>0){
                prev=i;
            }else{
                prev=-1;
            }
        }
        return sb.toString();
    }
}
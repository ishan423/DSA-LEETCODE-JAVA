class Solution {
    public String addSpaces(String s, int[] spaces) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++)
        {
            if(cnt <spaces.length && i == spaces[cnt] ){
                sb.append(' ');
                cnt++;
            }
            sb.append( s.charAt(i));
        }

         return sb.toString();





    }
}
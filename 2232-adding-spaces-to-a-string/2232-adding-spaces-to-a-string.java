class Solution {
    public String addSpaces(String s, int[] spaces) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
             sb.ensureCapacity(s.length() + spaces.length);// this reallocate the no of maximum character n a string which is effiecient as due to this the string builder does not need to allocate memeory every time it is called
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
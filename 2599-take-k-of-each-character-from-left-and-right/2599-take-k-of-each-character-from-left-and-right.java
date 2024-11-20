class Solution {
    public int takeCharacters(String s, int k) {
        int freq[]=new int[3];
        int n=s.length();
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        if(freq[0]<k || freq[1]<k || freq[2]<k){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int j=0;
        int i=0;
        while(j<n){
            char ch=s.charAt(j);
            freq[ch-'a']--;
            while(i<=j && freq[ch-'a']<k){
                freq[s.charAt(i)-'a']++;
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return n-max;
    }
}
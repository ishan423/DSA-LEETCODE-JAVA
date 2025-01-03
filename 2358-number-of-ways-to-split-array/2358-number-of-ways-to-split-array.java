class Solution {
    public int waysToSplitArray(int[] nums) {
           long pref[]=new long[nums.length];
        long suff[]=new long[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=nums[i]+pref[i-1];
        }
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=nums[i]+suff[i+1];
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(pref[i]>=suff[i+1]){
                count++;
            }
        }
        return count;
                // genrally what we are trying to do is to build a prefix array such that the sum of each can be there sio that the codition is satisfied 
                // in this part what i am essentially doing is just  taking the summ of element till their indexex and after that till certain index we have to find if we can split the array or not in order to d that we can subtract the sum till last  array elenment and then subtrat it from the sum till the first element if the sum is greater than the left side sum till last index the that split is valid 
                
               

    
    }
}
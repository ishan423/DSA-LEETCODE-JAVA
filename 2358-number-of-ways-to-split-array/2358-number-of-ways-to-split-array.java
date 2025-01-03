class Solution {
    public int waysToSplitArray(int[] nums) {
            long  [] prefix = new long [nums.length];
                int cnt = 0;
                prefix[0] = nums[0];
            for(int i = 1;i<nums.length;i++)
                {
                    prefix[i] = prefix[i-1] + nums[i];

                }
                // genrally what we are trying to do is to build a prefix array such that the sum of each can be there sio that the codition is satisfied 
                
                for(int i = 0;i<nums.length-1;i++){
                // in this part what i am essentially doing is just  taking the summ of element till their indexex and after that till certain index we have to find if we can split the array or not in order to d that we can subtract the sum till last  array elenment and then subtrat it from the sum till the first element if the sum is greater than the left side sum till last index the that split is valid 
                    long left = prefix[i];
                    long  right = prefix[nums.length-1] - prefix[i];
                    if(left>= right){
                        cnt++;
                    }

                }
                return cnt;

    
    }
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ans=solve(nums,0,0,target);
        return ans;
    }
    public int solve(int nums[],int i,int sum,int t){
        if(i==nums.length){
            return sum==t?1:0;
        }
        int plus=solve(nums,i+1,sum+nums[i],t);
        int minus=solve(nums,i+1,sum-nums[i],t);
        return plus+minus;
    }
}
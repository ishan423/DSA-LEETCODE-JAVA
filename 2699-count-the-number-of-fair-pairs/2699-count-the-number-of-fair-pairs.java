class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        return countPairs(nums, upper) - countPairs(nums, lower-1)
;    }

    public long countPairs(int[] nums, int target) {
        Arrays.sort(nums);
       int i=0, j= nums.length-1;
       long count=0;
       while(i<j){
        long sum = nums[i]+nums[j];
        if(sum<=target){
            count+=j-i;
            i++;
        }else {
            j--;
        }
       }
       return count; 
    }
}
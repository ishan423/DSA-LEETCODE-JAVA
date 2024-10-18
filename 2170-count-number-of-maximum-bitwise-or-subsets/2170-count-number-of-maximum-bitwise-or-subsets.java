class Solution {
    private int maxOr = 0;
    private int count = 0;

    private void countSubSet(int[] arr, int idx, int currOr, int n) {
        if (idx >= n) {
            if (currOr == maxOr) {
                count++;
            }
            return;
        }
        countSubSet(arr, idx + 1, currOr | arr[idx], n);
        countSubSet(arr, idx + 1, currOr, n);
    }
    public int countMaxOrSubsets(int[] nums) {
        int n=nums.length;
        
        for(int num : nums) maxOr |=num;
        countSubSet(nums,0,0,n);
        return count;
        
    }
}
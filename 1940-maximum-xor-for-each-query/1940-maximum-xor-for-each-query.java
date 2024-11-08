class Solution {
    public int[] getMaximumXor(int[] nums, int max) {
        int n  = nums.length;
        int curr = 0;

        int max1 = (1<<max)-1;
        for(int i : nums){
            curr^=i;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int [] x = new int[n];
        int j = 0;
        for(int i = n-1;i>=0;i--){
            // x[i] = curr ^ max1;
            ans.add(curr ^ max1);
            curr ^=nums[i];


        }
        
       for(int i = 0;i<ans.size();i++){
        x[i] = ans.get(i);
       }
        
        
        return x;
    }
}
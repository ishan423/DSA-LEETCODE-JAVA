class Solution {
    public static boolean ispossible(int [] nums,int mid,int m)
{    int tot = 0;

        for(int i : nums){
            int op  = i/mid;
            if(i%mid == 0){
                op-=1;
            }
                tot+=op;
        }
        return tot<=m;
         
}
    public int minimumSize(int[] nums, int m) {
        // int max = 0;
         int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();
        // Arrays.sort(num);
        // int max = 0;
        // int r = 0;
        for(int i:nums){
            r = Math.max(i,r);
        }
        int ans = 0;
        // int l = 0;
        while(l<=r){
             int mid = l + (r - l) / 2;
            if(ispossible(nums,mid,m)){
                ans= mid;
                r = mid - 1;

            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int cur = 0;
        int sum = 0;
        int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            cur+=arr[i];
            sum+=i;// check for the sorted part if sum is equal then chunks can be created otherwise not 
            if(cur == sum){
                cnt++;
            }

        }
        return cnt ;


        
    }
}
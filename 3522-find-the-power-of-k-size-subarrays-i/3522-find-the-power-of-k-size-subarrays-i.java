// class Solution {
//     public int[] resultsArray(int[] nums, int k) {
//                 int N = nums.length;
//                 int [] arr = new int[N-k+1];
//                 // Arrays.fill(arr,-1);
//                 for(int i = 0;i<=N-k;i++){
//                     // x = true;
//                 Boolean  x = true;

//                     for(int j = 0;j<i+k-1;j++){
//                         if(nums[j+1]!=nums[j]+1){
//                             x = false;
//                             break;
//                         }
//                     }
//                         if(x){
//                             arr[i] = arr[i + k - 1];
//                         }else{
//                             arr[i] = -1;
//                         }

//                 }        
//                     return arr;
//     }
// }
class Solution {

    public int[] resultsArray(int[] nums, int k) {
        int N = nums.length;
        int[] arr = new int[N - k + 1];

        for (int i= 0; i <= N - k; i++) {
            boolean x = true;

            // Check if the current subarray is sorted and consecutive
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j + 1] != nums[j] + 1) {
                    x = false;
                    break;
                }
            }

            // If valid, take the maximum of the subarray, otherwise set to -1
            if (x) {
                // Maximum element of this subarray
                arr[i] = nums[i + k - 1];
            } else {
                arr[i] = -1;
            }
        }

        return arr;
    }
}
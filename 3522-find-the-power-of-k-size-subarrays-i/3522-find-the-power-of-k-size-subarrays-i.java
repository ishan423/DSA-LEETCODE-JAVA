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

            for (int j = i; j < i + k - 1; j++) {
                if (nums[j + 1] != nums[j] + 1) {
                    x = false;
                    break;
                }
            }

            if (x) {
                arr[i] = nums[i + k - 1];
            } else {
                arr[i] = -1;
            }
        }

        return arr;
    }
}
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        // Arrays.sort(arr);
        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            // int curr = 0;
            for(int j = i;j<arr.length;j++){
               
               if((j-i+1)%2==1){
                 int curr = 0;
                 for(int k = i;k<j+1;k++){
                    curr+=arr[k];
                 }
                 sum+=curr;
               }
            }
        }
        return sum;
    }
}
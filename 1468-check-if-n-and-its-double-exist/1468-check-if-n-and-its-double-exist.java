class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int db = 0;
        for(int i = 0;i<arr.length;i++){
           for(int j = 0;j<arr.length-1;j++){
            if( i!=j &&arr[i] == 2*arr[j] ){
                return true;
            }
            // else{
            //     return false;
            // }
           }
        }

            return false;
    }
}
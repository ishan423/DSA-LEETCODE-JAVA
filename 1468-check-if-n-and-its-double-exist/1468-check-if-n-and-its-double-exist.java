class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int db = 0;
        for(int i = 0;i<arr.length;i++){
        //    for(int j = 0;j<arr.length-1;j++){
            // if( i!=j &&arr[i] == 2*arr[j] ){
            //     return true;
            // }
            // else{
            //     return false;
            // }
        //    }

             int target = 2*arr[i];

             int isvalid = valid(arr,target);
             if(isvalid !=i && isvalid>=0){
                return true;
             }
            //  else{
            //     return false;
            //  }

        }

            return false;
    }
    public static int  valid(int [] arr, int x1 ){
              int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
           
            int mid = left + (right - left) / 2;

            if (arr[mid] == x1) {
                return mid;
            } else if (arr[mid] < x1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;  
    }
}
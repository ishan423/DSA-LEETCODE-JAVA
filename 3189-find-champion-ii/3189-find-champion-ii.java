class Solution {
    public int findChampion(int n, int[][] e) {
        int indegree = 0;
        int [] arr = new int[n];
        Arrays.fill(arr,0);
            for(int [] e1:e){

            
              System.out.println(arr[e1[1]]++ + " " + e1[1]);
            }
                        
            int ans =-1;
            
            int cnt =  0;
            for(int i = 0;i<n;i++){
                if(arr[i] == 0){
                    cnt++;
                    ans = i;

                }
            }


        return cnt>1?-1:ans ;


    }
}
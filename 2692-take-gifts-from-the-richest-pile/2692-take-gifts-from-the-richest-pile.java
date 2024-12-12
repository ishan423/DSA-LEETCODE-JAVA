class Solution {
    public long pickGifts(int[] gifts, int k) {
        int max = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int i : gifts){ 
    pq.offer(i);
    }
    int j = 0;
    for(int i = 0 ;i<k;i++){
        
         max = pq.poll();

        double sq1 = Math.sqrt(Math.ceil(max));
        
        int x = (int)sq1;
        pq.offer(x);
       
   
    }
    long max1 = 0;
    while(!pq.isEmpty()){
        max1+= pq.poll();
    }
 
    
    return max1;}
}
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        
        List<int[]> ranges = new ArrayList<>();
        for (int num : nums) {
            ranges.add(new int[]{num - k, num + k});
        }

       
        ranges.sort((a, b) -> Integer.compare(a[0], b[0]));

        int maxBeauty = 0;
        Deque<Integer> deque = new ArrayDeque<>();

       
        for (int[] range : ranges) {
            while (!deque.isEmpty() && deque.peekFirst() < range[0]) {
                deque.pollFirst();
            }
            deque.offerLast(range[1]);

            maxBeauty = Math.max(maxBeauty, deque.size());
        }

        return maxBeauty;
    }
}

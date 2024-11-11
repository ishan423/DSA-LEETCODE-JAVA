class Solution {
   private boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        int[] pm = new int[1000]; 
        
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i))
                pm[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = nums[i] - 1; j >= 0; j--) {
                if (pm[j] == 1 && (i == 0 || nums[i] - j > nums[i - 1])) {
                    nums[i] -= j;
                    break;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                return false;
            }
        }

        return true;}
}
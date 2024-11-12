import java.util.Arrays;

class Solution {
    public int[] maximumBeauty(int[][] it, int[] qu) {
        int[] x = new int[qu.length];
        
        // Step 1: Sort the items by the first column
        Arrays.sort(it, (a, b) -> a[0] - b[0]);

        // Step 2: Update the second column (beauty) with the maximum beauty so far
        int max = it[0][1]; // Initialize max with the first element's beauty
        for (int i = 1; i < it.length; i++) {
            max = Math.max(it[i][1], max);
            it[i][1] = max; // Update the beauty value to the maximum seen so far
        }

        // Step 3: Print the matrix for debugging purposes
        // System.out.println("Matrix 'it' after processing:");
        // for (int i = 0; i < it.length; i++) {
        //     for (int j = 0; j < it[i].length; j++) {
        //         System.out.print(it[i][j] + " ");
        //     }
        //     System.out.println();  // New line for each row
        // }

        // Step 4: Process each query using binary search
        for (int i = 0; i < qu.length; i++) {
            int l = 0;
            int r = it.length - 1;
            int max1 = 0;
            
            // Binary search to find the maximum beauty for current query
            while (l <= r) {
                int mid = l + (r - l) / 2; // Corrected formula for mid
                
                // If the value at the current index is less than or equal to the query
                if (it[mid][0] <= qu[i]) {
                    max1 = Math.max(it[mid][1], max1); // Update max1 with the maximum beauty
                    l = mid + 1; // Search right half
                } else {
                    r = mid - 1; // Search left half
                }
            }
            
            // Store the result for the current query
            x[i] = max1;
        }

        return x;
    }
}

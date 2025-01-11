// class Solution {
//     public List<String> wordSubsets(String[] w, String[] words2) {
//        ArrayList<String> arr = new ArrayList<>();
//     //    String cur = 
//             boolean x = false;
//        for(int i = 0;i<w.length;i++){
//         String curr = w[i];
//         for(int j = 0;j<words2.length;j++){
//             if(i!=j && curr.contains(words2[i])){
//             x = true;
//             }else{
//                 x = false;
//             }
//         }
//         if(x == true){
//             arr.add(curr);
//         }
          
//        }
//        return arr;
//     }
// }
import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];

        // Step 1: Compute the max frequency of each character in words2
        for (String word : words2) {
            int[] freq = countFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();

        // Step 2: Check each word in words1
        for (String word : words1) {
            int[] freq = countFrequency(word);
            if (isUniversal(freq, maxFreq)) {
                result.add(word);
            }
        }

        return result;
    }

    // Helper method to count character frequency
    private int[] countFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    // Helper method to check if word meets max frequency requirements
    private boolean isUniversal(int[] wordFreq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
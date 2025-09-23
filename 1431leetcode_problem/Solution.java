 import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        
        // Step 1: Find max candies
        int max = 0;
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }

        // Step 2: Fill result list
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }

        return result;
    }
}

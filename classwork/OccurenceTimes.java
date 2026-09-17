import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 4, 1, 2, 2, 2};
        HashMap<Integer, Integer> counts = new HashMap<>();
        int maxOccurrence = 0;

        for (int n : nums) {
            // Increment count for the current number
            int currentCount = counts.getOrDefault(n, 0) + 1;
            counts.put(n, currentCount);

            // Update max if this number appears more than the previous highest
            if (currentCount > maxOccurrence) {
                maxOccurrence = currentCount;
            }
        }

import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0; // Only one tower, no difference

        Arrays.sort(arr); // Sort the array first

        // Initial difference without any modification
        int ans = arr[n - 1] - arr[0];

        // Initialize smallest and largest after all operations
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        // Loop through the array to find optimal partition
        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);

            // If minHeight goes negative, skip this partition
            if (minHeight < 0) continue;

            ans = Math.min(ans, maxHeight - minHeight);
        }

        return ans;
    }
}

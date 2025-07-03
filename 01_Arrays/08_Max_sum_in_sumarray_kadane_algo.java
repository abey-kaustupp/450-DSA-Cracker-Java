class Solution {
    public int maxSubarraySum(int[] arr) {
        int n = arr.length;

        // Initialize both sums to the first element, so negatives are handled correctly
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            // Either start fresh from arr[i], or extend previous subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update max sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

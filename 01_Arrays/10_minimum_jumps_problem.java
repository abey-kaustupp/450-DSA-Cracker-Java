class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;

        // If there's only one element, we're already at the end.
        if (n <= 1) return 0;

        // If the first element is 0, we can't make any move.
        if (arr[0] == 0) return -1;

        // If the first element is enough to reach or cross the last index directly.
        if (arr[0] >= n - 1) return 1;

        // maxReach stores the farthest index we can reach so far
        int maxReach = arr[0];
        // steps tells how many steps we can still take in current jump
        int steps = arr[0];
        // jumps counts how many jumps we have made
        int jumps = 1;

        // Loop through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // If we've reached the last index, return the jumps we made
            if (i == n - 1) return jumps;

            // Update maxReach to the farthest we can go from this index
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use one step to move to next index
            steps--;

            // If no more steps remain, we need to make another jump
            if (steps == 0) {
                jumps++; // We are making a new jump

                // If our current index is beyond the farthest we can reach, we are stuck
                if (i >= maxReach) return -1;

                // Reset steps to the number of steps we can take from the new jump
                steps = maxReach - i;
            }
        }

        // If we finish the loop without having returned, the end is not reachable
        return -1;
    }
}

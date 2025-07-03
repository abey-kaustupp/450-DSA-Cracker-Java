class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        if (n <= 1) return; // If the array has 0 or 1 element, nothing to rotate

        // Store the last element of the array,
        // because it will move to the first position after rotation.
        int last = arr[n - 1];

        // Shift each element from second last to first one position to the right.
        // We go backwards so we don't overwrite elements we still need to move.
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i]; // Move current element to its next index
        }

        // Place the last element at the first position to complete rotation
        arr[0] = last;
    }
}

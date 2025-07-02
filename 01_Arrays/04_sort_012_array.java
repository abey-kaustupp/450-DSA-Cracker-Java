class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int low = 0;               // pointer for the next 0
        int mid = 0;               // current index being checked
        int high = arr.length - 1; // pointer for the next 2

        // Process elements until mid crosses high
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid] to move 0 to the beginning
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // If it's 1, it's already in correct position; move mid
                mid++;
            } else if (arr[mid] == 2) {
                // Swap arr[mid] and arr[high] to move 2 to the end
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}

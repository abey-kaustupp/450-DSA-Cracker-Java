class Solution {

    public void reverseArray(int arr[]) {
        int left = 0; // pointer starting from the first index
        int right = arr.length - 1; // pointer starting from the last index

        // Loop until the two pointers meet or cross
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left]; // temporarily store the left element
            arr[left] = arr[right]; // assign the right element to the left position
            arr[right] = temp; // assign the stored left element to the right position

            // Move the pointers towards each other
            left++;
            right--;
        }
    }
}

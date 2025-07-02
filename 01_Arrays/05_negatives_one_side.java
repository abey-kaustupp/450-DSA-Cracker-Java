class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; // temporary array to store result
        int index = 0;

        // First, copy all positive elements to temp
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Next, copy all negative elements to temp
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy temp back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Handle empty array case (if needed), though constraints guarantee size >= 1
        if (arr == null || arr.length == 0) {
            return null; // or throw an exception if you want stricter behavior
        }

        int min = arr[0]; // initialize min with first element
        int max = arr[0]; // initialize max with first element

        // Traverse the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // update min if current element is smaller
            }
            if (arr[i] > max) {
                max = arr[i]; // update max if current element is larger
            }
        }

        // Return the min and max in a Pair
        return new Pair<>(min, max);
    }
}

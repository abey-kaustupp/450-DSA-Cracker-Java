import java.util.Random;

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // k is 1-based in the problem, but our quickSelect uses 0-based index
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    // QuickSelect algorithm: similar to QuickSort, but only recurses into the side containing the k-th element
    private static int quickSelect(int[] arr, int left, int right, int k) {
        // If the list contains only one element, return it
        if (left == right) return arr[left];

        // Choose a random pivot index between left and right (inclusive)
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        
        // Partition the array around the pivot and get the final position of the pivot
        pivotIndex = partition(arr, left, right, pivotIndex);
        
        // If the pivot is at k, we found the k-th smallest element
        if (k == pivotIndex) {
            return arr[k];
        }
        // If k is smaller, search the left part
        else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        }
        // Otherwise, search the right part
        else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    // Partition function: places elements smaller than pivotValue on the left,
    // larger on the right; returns the final index of the pivot
    private static int partition(int[] arr, int left, int right, int pivotIndex) {
        int pivotValue = arr[pivotIndex];
        
        // Move pivot to the end temporarily
        swap(arr, pivotIndex, right);
        
        // storeIndex will be the final position for the pivot
        int storeIndex = left;
        
        // Rearrange elements: all smaller than pivotValue come before storeIndex
        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }
        
        // Move pivotValue to its final sorted place
        swap(arr, right, storeIndex);
        
        return storeIndex;
    }

    // Utility swap function to swap elements at two indices
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

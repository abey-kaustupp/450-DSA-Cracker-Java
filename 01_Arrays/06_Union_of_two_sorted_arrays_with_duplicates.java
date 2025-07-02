import java.util.HashSet;

class Solution {
    public static int findUnion(int a[], int b[]) {
        // Create a HashSet to store unique elements
        HashSet<Integer> unionSet = new HashSet<>();

        // Add all elements from array a
        for (int num : a) {
            unionSet.add(num);
        }

        // Add all elements from array b
        for (int num : b) {
            unionSet.add(num);
        }

        // The size of the set is the number of distinct elements in the union
        return unionSet.size();
    }
}

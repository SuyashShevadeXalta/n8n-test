package searching;

/**
 * Linear Search Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Linear search is the simplest searching algorithm.
 * It searches for an element by iterating through the array sequentially.
 */
public class LinearSearch {

    /**
     * Searches for a target value in an unsorted array
     * @param arr The input array
     * @param target The value to search for
     * @return The index of target if found, -1 otherwise
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Generic linear search for any comparable object
     */
    public static <T extends Comparable<T>> int linearSearchGeneric(T[] arr, T target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(target) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Linear Search Example:");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Search 40: Index = " + linearSearch(arr, 40));
        System.out.println("Search 100: Index = " + linearSearch(arr, 100));
    }
}
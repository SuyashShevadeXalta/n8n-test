package searching;

/**
 * Binary Search Algorithm
 * Time Complexity: O(log n)
 * Space Complexity: O(1) iterative, O(log n) recursive
 * 
 * Binary search works on sorted arrays.
 * It divides the search interval by half in each iteration.
 */
public class BinarySearch {

    /**
     * Iterative binary search
     * @param arr Sorted array
     * @param target Value to search
     * @return Index of target or -1
     */
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Recursive binary search
     */
    public static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }

    /**
     * Find first occurrence of target in sorted array
     */
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching on left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    /**
     * Find last occurrence of target in sorted array
     */
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching on right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("Binary Search Examples:");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Search 40 (Iterative): " + binarySearchIterative(arr, 40));
        System.out.println("Search 40 (Recursive): " + binarySearchRecursive(arr, 40));
        
        int[] arrWithDuplicates = {10, 20, 20, 20, 30, 40, 50};
        System.out.println("\nArray with duplicates: " + java.util.Arrays.toString(arrWithDuplicates));
        System.out.println("First occurrence of 20: " + findFirstOccurrence(arrWithDuplicates, 20));
        System.out.println("Last occurrence of 20: " + findLastOccurrence(arrWithDuplicates, 20));
    }
}
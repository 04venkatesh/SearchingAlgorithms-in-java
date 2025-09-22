public class RecursiveBinarySearch {

    // Recursive Binary Search method
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // Base case: element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] < target) {
            // Search in right half
            return binarySearchRecursive(arr, mid + 1, right, target);
        } else {
            // Search in left half
            return binarySearchRecursive(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14}; // sorted array
        int target = 10;

        System.out.println("=== Recursive Binary Search ===");
        int result = binarySearchRecursive(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in array.");
        }
    }
}

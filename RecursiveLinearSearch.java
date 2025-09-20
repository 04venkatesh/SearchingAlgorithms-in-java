import java.util.Scanner;
public class RecursiveLinearSearch {
    public static int linearSearchRecursive(int[] arr, int key, int index) {
        if (index >= arr.length) return -1; // not found
        if (arr[index] == key) return index;
        return linearSearchRecursive(arr, key, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int result = linearSearchRecursive(arr, key, 0);
        if (result != -1)
            System.out.println("Key element found at index: " + result);
        else
            System.out.println("Key element not found in the array.");
        sc.close();
    }
}

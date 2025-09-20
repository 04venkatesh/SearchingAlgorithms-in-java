import java.util.Scanner;
public class IterativeLinearSearch {
    // Linear Search returns the index if found, -1 if not found
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index instead of 1
            }
        }
        return -1; // not found
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
        int result = linearSearch(arr, key);
        if (result != -1)
            System.out.println("Key element found at index: " + result);
        else
            System.out.println("Key element not found in the array.");
        sc.close();
    }
}
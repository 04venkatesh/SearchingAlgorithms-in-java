import java.util.Scanner;

public class SentinelLinearSearch {
    public static int sentinelLinearSearch(int[] arr, int key) {
        int n = arr.length;
        int last = arr[n - 1];
        arr[n - 1] = key;
        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last; // restore original value
        if (i < n - 1 || arr[n - 1] == key) return i;
        return -1;
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
        int result = sentinelLinearSearch(arr.clone(), key);
        if (result != -1)
            System.out.println("Key element found at index: " + result);
        else
            System.out.println("Key element not found in the array.");
        sc.close();
    }
}
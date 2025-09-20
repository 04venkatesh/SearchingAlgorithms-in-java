import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamLinearSearch {
    public static int linearSearchStream(int[] arr, int key) {
        return IntStream.range(0, arr.length)
                        .filter(i -> arr[i] == key)
                        .findFirst()
                        .orElse(-1);
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

        int result = linearSearchStream(arr, key);
        if (result != -1)
            System.out.println("Key element found at index: " + result);
        else
            System.out.println("Key element not found in the array.");
        sc.close();
    }
}

import java.util.*;

public class ListLinearSearch {
    public static int linearSearchList(List<Integer> list, int key) {
        return list.indexOf(key); // returns -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        System.out.print("Enter the ArrayList Size:");
        int size=sc.nextInt();

        System.out.print("Enter the Elements of ArrayList:");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Enter the search key:");
        int key =sc.nextInt();
        int result = linearSearchList(list, key);
        if(result !=-1)
            System.out.println("Key element found at index in ArrayList:" + result);
        else
            System.out.println("Key element not found in the ArrayList");
        sc.close();
    }
}

import java.util.*;

public class ListClear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println("Original LinkedList: " + list);

        // Remove all elements
        list.clear();

        System.out.println("LinkedList after clearing: " + list);
    }
}
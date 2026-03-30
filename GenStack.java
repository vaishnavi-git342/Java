import java.util.*;

// Generic Stack class
class Stack<T> {
    private LinkedList<T> stackList = new LinkedList<>();

    public void push(T element) {
        stackList.addFirst(element);
        System.out.println(element + " pushed");
    }

    public T pop() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T element = stackList.removeFirst();
        System.out.println(element + " popped");
        return element;
    }

    public void display() {
        System.out.println("Stack: " + stackList);
    }
}

public class GenStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer stack
        Stack<Integer> intStack = new Stack<>();
        System.out.print("Enter number of integers to push: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            intStack.push(sc.nextInt());
        }
        intStack.display();

        System.out.print("Pop how many integers? ");
        int pops = sc.nextInt();
        for (int i = 0; i < pops; i++) {
            intStack.pop();
        }
        intStack.display();

        // String stack
        Stack<String> stringStack = new Stack<>();
        System.out.print("Enter number of strings to push: ");
        int m = sc.nextInt();
        sc.nextLine(); // consume newline
        for (int i = 0; i < m; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringStack.push(sc.nextLine());
        }
        stringStack.display();

        System.out.print("Pop how many strings? ");
        int popsS = sc.nextInt();
        sc.nextLine(); // consume newline
        for (int i = 0; i < popsS; i++) {
            stringStack.pop();
        }
        stringStack.display();
    }
}
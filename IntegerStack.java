import java.util.Stack;
import java.util.Scanner;

public class IntegerStack {

    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Element " + element + " pushed onto the stack.");
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            int removedElement = stack.pop();
            System.out.println("Element " + removedElement + " popped from the stack.");
        } else {
            System.out.println("Stack is empty, nothing to pop.");
        }
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push onto the stack: ");
                    int element = scanner.nextInt();
                    integerStack.pushElement(element);
                    break;
                case 2:
                    integerStack.popElement();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// Output
1. Push Element
2. Pop Element
3. Exit
Enter your choice: 1
Enter an integer to push onto the stack: 4
Element 4 pushed onto the stack.
1. Push Element
2. Pop Element
3. Exit
Enter your choice: 2
Element 4 popped from the stack.
1. Push Element
2. Pop Element
3. Exit
Enter your choice: 3
Exiting...

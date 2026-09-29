import java.util.Scanner;

class Stack {
    private static final int MAX = 10;
    private int[] arr;
    private int top;

    public Stack() {
        arr = new int[MAX];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
        } else {
            int poppedValue = arr[top--];
            System.out.println("Popped element: " + poppedValue);
        }
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}


public class stack_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int choice = 0;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    if (sc.hasNextInt()) {
                        int val = sc.nextInt();
                        stack.push(val);
                    } else {
                        System.out.println("Invalid input!");
                        sc.next();
                    }
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }
        } while (choice != 4);

        sc.close();
    }
}

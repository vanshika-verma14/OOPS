// Write a Java program that defines an interface StackInterface with three methods: push(), pop(), and display(). Implement this interface in a class called StackClass. The StackClass should also contain the main method, where a switch-case structure is used to allow users to select and perform stack operations.
import java.util.Scanner;
interface StackInterface {
    void push(int x);
    int pop();
    void display();
}

public class StackClass implements StackInterface {
    int[] stack = new int[10];
    int top = -1;
    
    public void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = x;
        System.out.println(x + " pushed");
    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println(stack[top] + " popped");
        return stack[top--];
    }
    
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        StackClass s = new StackClass();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Push  2. Pop  3. Display  4. Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

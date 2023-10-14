import java.util.EmptyStackException;

class Stack {
    private static final int MAX_SIZE = 1000;
    private int top;
    private int[] array;

    public Stack() {
        this.top = -1;
        this.array = new int[MAX_SIZE];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push element onto the stack.");
            return;
        }
        array[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}

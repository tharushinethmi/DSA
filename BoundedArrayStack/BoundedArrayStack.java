import java.util.NoSuchElementException;

public class BoundedArrayStack {

    private int maxSize;
    private int[] array;
    private int tos;

    public BoundedArrayStack(int s) {
        maxSize = s;
        array = new int[maxSize];
        tos = -1;
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public boolean isFull() {
        return tos == maxSize - 1;
    }

    public void push(int j) {
        if (isFull()) {
            throw new IllegalStateException("Stack is Full");
        } else {
            array[++tos] = j;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is Empty");
        } else {
            return array[tos--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is Empty");
        } else {
            return array[tos];
        }
    }

    public void print() {
        System.out.print("Stack elements: [");
        for (int i = tos; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        BoundedArrayStack theStack = new BoundedArrayStack(5);

        for (int i = 1; i <= 5; i++) {
            if (!theStack.isFull()) {
                theStack.push(i * 10);
            } else {
                System.out.println("Cannot push. Stack is Full");
            }
        }

        if (!theStack.isEmpty()) {
            System.out.println("Top element is: " + theStack.peek());
        } else {
            System.out.println("Stack is empty, nothing to peek");
        }

        if (!theStack.isEmpty()) {
            System.out.print("Popping elements: ");
            while (!theStack.isEmpty()) {
                int val = theStack.pop();
                System.out.print(val + " ");
            }
            System.out.println();
        } else {
            System.out.println("Cannot pop, stack is empty");
        }

        theStack.print();
    }
}
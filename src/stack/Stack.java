package stack;

public class Stack {

    private final int[] elements = new int[2];
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        this.elements[size++] = element;
    }

    public int pop() {
        if (isEmpty())
            throw new Underflow();
        return elements[--size];
    }

    public class Underflow extends RuntimeException {
    }

}

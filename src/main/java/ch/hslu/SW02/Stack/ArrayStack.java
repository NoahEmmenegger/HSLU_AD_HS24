package ch.hslu.SW02.Stack;

public class ArrayStack implements Stack {
    private final String[] stack;
    private final int size;
    private int top;

    public ArrayStack(int size) {
        this.stack = new String[size];
        this.size = size;
        this.top = -1;
    }

    @Override
    public void push(String item) {
        if (top < size - 1) {
            stack[++top] = item;
        } else {
            throw new IllegalStateException("Stack is full");
        }
    }

    @Override
    public String pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    @Override
    public String peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}

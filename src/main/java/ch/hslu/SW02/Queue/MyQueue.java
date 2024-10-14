package ch.hslu.SW02.Queue;
public class MyQueue  implements Queue {
    private final char[] array;
    private int head;
    private int tail;
    private final int capacity;
    private int size;

    public MyQueue(int capacity) {
        this.array = new char[capacity];
        this.head = 0;
        this.tail = 0;
        this.capacity = capacity;
        this.size = 0;
    }

    @Override
    public void enqueue(char c) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        array[tail] = c;
        tail = (tail + 1) % capacity;
        size++;
    }

    @Override
    public char dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        char c = array[head];
        head = (head + 1) % capacity;
        size--;
        return c;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }
}

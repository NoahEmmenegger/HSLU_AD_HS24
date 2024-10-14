package ch.hslu.SW02.Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void enqueue() {
        MyQueue queue = new MyQueue(2);
        queue.enqueue('a');
        queue.enqueue('b');
        assertThrows(IllegalStateException.class, () -> queue.enqueue('c'));
    }

    @Test
    void dequeue() {
        MyQueue queue = new MyQueue(2);
        queue.enqueue('a');
        queue.enqueue('b');
        assertEquals('a', queue.dequeue());
        assertEquals('b', queue.dequeue());
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    void isEmpty() {
        MyQueue queue = new MyQueue(2);
        assertTrue(queue.isEmpty());
        queue.enqueue('a');
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void isFull() {
        MyQueue queue = new MyQueue(2);
        assertFalse(queue.isFull());
        queue.enqueue('a');
        assertFalse(queue.isFull());
        queue.enqueue('b');
        assertTrue(queue.isFull());
    }
}
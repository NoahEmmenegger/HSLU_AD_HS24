package ch.hslu.SW02.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void notMain() {
        Stack stack = new ArrayStack(2);
        assertTrue(stack.isEmpty());
        stack.push("Test1");
        assertFalse(stack.isEmpty());
        stack.push("Test2");
        assertTrue(stack.isFull());
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void pushIfOverflow() {
        Stack stack = new ArrayStack(2);
        stack.push("Test1");
        stack.push("Test2");
        assertThrows(IllegalStateException.class, () -> stack.push("Test3"));
    }

    @Test
    void popIfUnderflow() {
        Stack stack = new ArrayStack(2);
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void peek() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void isFull() {
    }

    @Test
    void size() {
    }
}
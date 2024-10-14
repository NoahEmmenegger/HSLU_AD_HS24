package ch.hslu.SW02.Stack;

/**
 * Interface for a stack.
 */
public interface Stack {
    /**
     * Pushes an item onto the top of this stack.
     * @param item the item to be pushed onto this stack.
     */
    void push(String item);
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @return The object at the top of this stack.
     */
    String pop();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return The object at the top of this stack.
     */
    String peek();

    /**
     * Tests if this stack is empty.
     * @return
     */
    boolean isEmpty();

    /**
     * Tests if this stack is full.
     * @return
     */
    boolean isFull();

    /**
     * Returns the number of elements in this stack.
     * @return
     */
    int size();
}

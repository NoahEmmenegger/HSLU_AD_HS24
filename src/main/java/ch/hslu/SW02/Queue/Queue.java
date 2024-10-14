package ch.hslu.SW02.Queue;



public interface Queue {
    /**
     * Adds an element to the queue.
     * @return
     */
    void enqueue(char c);


    /**
     * Removes an element from the queue.
     * @return
     */
    char dequeue();


    /**
     * Checks if the queue is empty.
     * @return
     */
    boolean isEmpty();

    /**
     * Checks if the queue is full.
     * @return
     */
    boolean isFull();
}

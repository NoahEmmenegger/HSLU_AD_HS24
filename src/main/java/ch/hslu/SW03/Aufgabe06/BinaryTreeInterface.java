package ch.hslu.SW03.Aufgabe06;

/**
 * Interface for a binary tree.
 * @param <T> Type of the values in the tree.
 */
public interface BinaryTreeInterface<T> {
    /**
     * Inserts a value into the tree.
     * @param value The value to insert.
     */
    void insert(T value);

    /**
     * Removes a value from the tree.
     * @param value The value to remove.
     */
    void remove(T value);

    /**
     * Checks if the tree contains a value.
     * @param value The value to check for.
     * @return True if the value is in the tree, false otherwise.
     */
    boolean contains(T value);

    /**
     * Checks if the tree is empty.
     * @return True if the tree is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Balances the tree.
     */
    void balance(TreeNode<T> node);
}

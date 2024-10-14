package ch.hslu.SW03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insert() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(7));
        assertEquals(3, tree.getSize());
    }

    @Test
    void remove() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.remove(5);
        assertFalse(tree.contains(5));
        assertEquals(2, tree.getSize());
    }

    @Test
    void contains() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        assertTrue(tree.contains(5));
        assertFalse(tree.contains(8));
    }

    @Test
    void search() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        assertEquals(5, tree.search(5).getValue());
        assertEquals(3, tree.search(3).getValue());
        assertEquals(7, tree.search(7).getValue());
    }

    @Test
    void isEmpty() {
        BinarySearchTree tree = new BinarySearchTree();
        assertTrue(tree.isEmpty());
        tree.insert(5);
        assertFalse(tree.isEmpty());
    }
}
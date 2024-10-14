package ch.hslu.SW03.Aufgabe06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
    private BinarySearchTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinarySearchTree();
    }

    @Test
    void testInsertAndContains() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        assertTrue(tree.contains(50));
        assertTrue(tree.contains(30));
        assertTrue(tree.contains(70));
        assertTrue(tree.contains(20));
        assertTrue(tree.contains(40));
        assertTrue(tree.contains(60));
        assertTrue(tree.contains(80));
        assertFalse(tree.contains(90));
    }

    @Test
    void testRemoveLeafNode() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);

        tree.remove(30);
        assertFalse(tree.contains(30));
    }

    @Test
    void testRemoveNodeWithOneChild() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);

        //    50
        //   /  \
        //  30  70
        // /
        //20

        tree.remove(30);
        //      50
        //     /  \
        //    20  70

        assertFalse(tree.contains(30));
        assertTrue(tree.contains(20)); // Der Knoten mit dem Wert 20 sollte noch vorhanden sein
    }

    @Test
    void testRemoveNodeWithTwoChildren() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        //          50
        //         /  \
        //        30  70
        //       / \
        //      20 40


        tree.remove(30);

        //         50
        //        /  \
        //       40  70
        //      /
        //     20

        assertFalse(tree.contains(30));
        assertTrue(tree.contains(20));
        assertTrue(tree.contains(40));
    }

    @Test
    void testSearchNode() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);

        assertNotNull(tree.search(30));
        assertNull(tree.search(90));
    }

    @Test
    void testGetHashCodeOfNode() {
        tree.insert(50);
        TreeNode<Integer> node = tree.search(50);

        assertNotNull(node);
        assertEquals(50, node.getHash()); // Da Integer die Hashfunktion überschreibt, ist der Hashcode von 50 ebenfalls 50.
    }

    @Test
    void testIsEmpty() {
        assertTrue(tree.isEmpty());

        tree.insert(50);
        assertFalse(tree.isEmpty());
    }

    @Test
    void testSizeAfterInsertAndRemove() {
        assertEquals(0, tree.getSize());

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);

        assertEquals(3, tree.getSize());

        tree.remove(30);
        assertEquals(2, tree.getSize());
    }

    @Test
    void testToString() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);

        String treeString = tree.toString();
        assertTrue(treeString.contains("root=TreeNode{value=50"));
        assertTrue(treeString.contains("size=3"));
    }
}

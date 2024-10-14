package ch.hslu.SW02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void withMultipleNodesTest() {
        Node node = new Node("Test1", 10);
        Node node2 = new Node("Test2", 20);

        List<Node> nodes = List.of(node, node2);

        LinkedList linkedList = new LinkedList(nodes);
        assertEquals(2, linkedList.getSize());
    }

    @Test
    void add() {
        Node node = new Node("Test1", 10);
        Node node2 = new Node("Test2", 20);

        LinkedList linkedList = new LinkedList();
        linkedList.add(node);
        linkedList.add(node2);
        assertEquals(2, linkedList.getSize());
    }

    @Test
    void addMultiple() {
        Node node = new Node("Test1", 10);
        Node node2 = new Node("Test2", 20);

        LinkedList linkedList = new LinkedList();
        linkedList.add(List.of(node, node2));
        assertEquals(2, linkedList.getSize());
    }

    @Test
    void size() {
        Node node = new Node("Test1", 10);
        Node node2 = new Node("Test2", 20);

        LinkedList linkedList = new LinkedList();
        linkedList.add(node);
        linkedList.add(node2);
        assertEquals(2, linkedList.getSize());
    }

    @Test
    void contains() {
        Node node = new Node("Test1", 10);
        Node node2 = new Node("Test2", 20);
        Node node3 = new Node("Test3", 30);

        LinkedList linkedList = new LinkedList();
        linkedList.add(node);
        linkedList.add(node2);
        assertTrue(linkedList.contains(node));
        assertFalse(linkedList.contains(node3));
    }

    @Test
    void pop() {
        Node node = new Node("Test1", 10);
        Node node2 = new Node("Test2", 20);

        LinkedList linkedList = new LinkedList();
        linkedList.add(node);
        linkedList.add(node2);
        assertEquals(2, linkedList.getSize());
        linkedList.pop();
        assertEquals(1, linkedList.getSize());
    }

    @Test
    void remove() {
        Node node = new Node("Test1", 10);
        Node node2 = new Node("Test2", 20);

        LinkedList linkedList = new LinkedList();
        linkedList.add(node);
        linkedList.add(node2);
        assertEquals(2, linkedList.getSize());
        linkedList.remove(node);
        assertEquals(1, linkedList.getSize());
        assertTrue(linkedList.contains(node2));
        assertFalse(linkedList.contains(node));
    }
}
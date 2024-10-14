package ch.hslu.SW02;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void testNode() {
        Allocation allocation = new Allocation("Test", 10);
        Node node = new Node(allocation);
        assertEquals(allocation, node.getData());
        assertNull(node.getNext());
    }

    @org.junit.jupiter.api.Test
    void withMultipleNodesTest() {
        Allocation allocation1 = new Allocation("Test1", 10);
        Allocation allocation2 = new Allocation("Test2", 20);
        Node node1 = new Node(allocation1);
        Node node2 = new Node(allocation2);

        List<Node> nodes = List.of(node1, node2);

        LinkedList linkedList = new LinkedList(nodes);
    }



}
package ch.hslu.SW02;

import java.util.ArrayList;
import java.util.List;

// sematik: FirstInFirstOut
public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // constructor with list of nodes
    public LinkedList(List<Node> nodes) {
        this.head = null;
        this.size = 0;
        for (Node node : nodes) {
            add(node);
        }
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public void add(List<Node> nodes) {
        for (Node node : nodes) {
            add(node);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean contains(Node node) {
        Node current = head;
        while (current != null) {
            if (current.equals(node)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public Node pop() {
        if (head == null) {
            return null;
        }
        Node current = head;
        head = head.getNext();
        size--;
        return current;
    }

    public void remove(Node node) {
        if (head == null) {
            return;
        }
        if (head.equals(node)) {
            head = head.getNext();
            size--;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().equals(node)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }
}

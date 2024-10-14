package ch.hslu.SW02;

import java.util.Objects;

public class Node {
    private Allocation data;  // Das gespeicherte Objekt vom Typ Allocation
    private Node next;        // Referenz auf den nächsten Knoten

    // Konstruktor
    public Node(Allocation data) {
        this.data = data;
        this.next = null;  // Der nächste Knoten ist anfangs null
    }

    public Node(String resourceName, int amount) {
        this.data = new Allocation(resourceName, amount);
        this.next = null;  // Der nächste Knoten ist anfangs null
    }

    // Getter und Setter für die Daten
    public Allocation getData() {
        return data;
    }

    public void setData(Allocation data) {
        this.data = data;
    }

    // Getter und Setter für den nächsten Knoten
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        return (o instanceof Node node)
                && Objects.equals(getData(), node.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData());
    }
}


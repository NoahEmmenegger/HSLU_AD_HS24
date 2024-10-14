package ch.hslu.SW03.Aufgabe06;
public class TreeNode<T> {
    private T value;
    private int hash;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
        this.hash = value.hashCode();  // Berechnung des Hashcodes beim Erstellen des Knotens
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
        this.hash = value.hashCode(); // Aktualisiert den Hashcode, wenn der Wert geändert wird
    }

    public int getHash() {
        return hash;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", hash=" + hash +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

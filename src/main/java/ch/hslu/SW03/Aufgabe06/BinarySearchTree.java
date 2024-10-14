package ch.hslu.SW03.Aufgabe06;

public class BinarySearchTree implements BinaryTreeInterface<Integer> {
    private TreeNode<Integer> root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public void insert(Integer value) {
        if (root == null) {
            root = new TreeNode<>(value);
        } else {
            insert(value, root);
        }
        size++;
    }

    private void insert(Integer value, TreeNode<Integer> node) {
        if (value < node.getValue()) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode<>(value));
            } else {
                insert(value, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode<>(value));
            } else {
                insert(value, node.getRight());
            }
        }
    }

    @Override
    public void remove(Integer value) {
        root = remove(value, root);
        size--;
    }

    private TreeNode<Integer> remove(Integer value, TreeNode<Integer> node) {
        if (node == null) {
            return null;
        }
        if (value < node.getValue()) {
            node.setLeft(remove(value, node.getLeft()));
        } else if (value > node.getValue()) {
            node.setRight(remove(value, node.getRight()));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            } else {
                node.setValue(findMin(node.getRight()).getValue());
                node.setRight(remove(node.getValue(), node.getRight()));
            }
        }
        return node;
    }

    private TreeNode<Integer> findMin(TreeNode<Integer> node) {
        if (node.getLeft() == null) {
            return node;
        } else {
            return findMin(node.getLeft());
        }
    }

    @Override
    public boolean contains(Integer value) {
        return contains(value, root);
    }

    private boolean contains(Integer value, TreeNode<Integer> node) {
        if (node == null) {
            return false;
        }
        if (value < node.getValue()) {
            return contains(value, node.getLeft());
        } else if (value > node.getValue()) {
            return contains(value, node.getRight());
        } else {
            return true;
        }
    }

    public TreeNode<Integer> search(Integer value) {
        return search(value, root);
    }

    private TreeNode<Integer> search(Integer value, TreeNode<Integer> node) {
        if (node == null) {
            return null;
        }
        if (value < node.getValue()) {
            return search(value, node.getLeft());
        } else if (value > node.getValue()) {
            return search(value, node.getRight());
        } else {
            return node;
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void balance(TreeNode<Integer> node) {

    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }
}

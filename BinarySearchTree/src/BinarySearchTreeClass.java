public class BinarySearchTreeClass {
    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(); // create new Node
        newNode.setKey(key);
        newNode.setValue(value);

        if (root == null) {
            root = newNode; // new node is root
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (key == current.getKey()) {
                    return;
                } else if (key < current.getKey()) { // left
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight(); //  right;
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void print(Node node) {
        if(node != null) {
            print(node.getLeft());
            node.printNode();
            print(node.getRight());
        }
    }

    public Node find (int key) {

        return root;
    }

    public Node getRoot() {
        return root;
    }
}

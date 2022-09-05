public class Main {
    public static void main(String[] args) {
        BinarySearchTreeClass binarySearchTree = new BinarySearchTreeClass();

        binarySearchTree.insert(13, "13");
        binarySearchTree.insert(5, "5");
        binarySearchTree.insert(8, "8");
        binarySearchTree.insert(1, "1");
        binarySearchTree.insert(30, "30");


        PrintTree.print(binarySearchTree.getRoot());
        System.out.println("");
    }
}

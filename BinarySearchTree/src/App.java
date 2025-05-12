public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(2));
        tree.insert(new Node(8));
        tree.insert(new Node(13));
        tree.insert(new Node(6));
        tree.insert(new Node(0));
        tree.insert(new Node(4));
        tree.insert(new Node(7));
        tree.insert(new Node(10));
        tree.insert(new Node(1));

        tree.display();

        System.out.println(tree.search(14));
        tree.remove(7);
        tree.display();
    }
}

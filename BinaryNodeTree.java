public class BinaryNodeTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static boolean nodeExists(Node node, int key) {
        if (node == null)
            return false;
        if (node.data == key)
            return true;
        boolean node1 = nodeExists(node.left, key);
        if (node1) return true;
        boolean node2 = nodeExists(node.right, key);
        if (node2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryNodeTree.Node root = new BinaryNodeTree.Node(0);
        root.left = new BinaryNodeTree.Node(1);
        root.left.left = new BinaryNodeTree.Node(3);
        root.left.left.left = new BinaryNodeTree.Node(42 );
        root.left.right = new BinaryNodeTree.Node(4);
        root.left.right.left = new BinaryNodeTree.Node(8);
        root.left.right.right = new BinaryNodeTree.Node(9);
        root.right = new BinaryNodeTree.Node(2);
        root.right.left = new BinaryNodeTree.Node(5);
        root.right.right = new BinaryNodeTree.Node(7);
        int key = 70  ;
        if (nodeExists(root, key)) System.out.println("true");
        else System.out.println("false");
    }
}


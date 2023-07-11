import java.util.function.Function;
import java.util.Stack;

class Program {
    public static void iterativeInOrderTraversal(BinaryTree root, Function<BinaryTree, Void> callback) {
        // Write your code here.
        if (root == null)
            return;

        Stack<BinaryTree> s = new Stack<BinaryTree>();
        BinaryTree curr = root;

        // Traverse the tree
        while (curr != null || s.size() > 0) {
            // Reach the left most Node of the curr Node
            while (curr != null) {
                s.push(curr); // Place pointer to a tree node on the stack before traversing the node's left subtree
                curr = curr.left;
            }

            curr = s.pop(); // Current must be NULL at this point

            System.out.print(curr.value + " ");
            callback.apply(curr);
            
            curr = curr.right;
        }
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;
        public BinaryTree parent;

        public BinaryTree(int value) {
            this.value = value;
        }

        public BinaryTree(int value, BinaryTree parent) {
            this.value = value;
            this.parent = parent;
        }
    }
}

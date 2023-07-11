class Program {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean symmetricalTree(BinaryTree tree) {
        return helper(tree.right, tree.left);
    }

    public boolean helper(BinaryTree t1, BinaryTree t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null && t2 != null)
            return false;
        if (t1 != null && t2 == null)
            return false;
        if (t1.value != t2.value)
            return false;

        return helper(t1.left, t2.right) && helper(t1.right, t2.left);
    }
}

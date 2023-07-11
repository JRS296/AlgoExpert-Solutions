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

    public BinaryTree mergeBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
        if (tree1 == null && tree2 == null)
            return null;

        int val1 = tree1 != null ? tree1.value : 0;
        int val2 = tree2 != null ? tree2.value : 0;

        BinaryTree t1r = tree1 != null ? tree1.right : null;
        BinaryTree t2r = tree2 != null ? tree2.right : null;
        BinaryTree t1l = tree1 != null ? tree1.left : null;
        BinaryTree t2l = tree2 != null ? tree2.left : null;

        BinaryTree ans = new BinaryTree(val1 + val2);
        ans.right = mergeBinaryTrees(t1r, t2r);
        ans.left = mergeBinaryTrees(t1l, t2l);

        return ans;
    }
}

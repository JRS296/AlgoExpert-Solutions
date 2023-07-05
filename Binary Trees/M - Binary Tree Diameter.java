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

  public int binaryTreeDiameter(BinaryTree tree) {
    int diameter[] = new int[1];
    //int ans = helper(tree, diameter);
    helper(tree, diameter);
    //System.out.println(ans+ " "+ diameter[0]);
    return diameter[0];
  }

  public int helper(BinaryTree tree, int d[]) {
    if (tree==null) return 0;
    int left = helper(tree.left, d);
    int right = helper(tree.right, d);

    d[0] = Math.max(d[0], left+right);
    return Math.max(left,right)+1;
  }
}

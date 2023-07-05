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

  public int evaluateExpressionTree(BinaryTree tree) {
    if(tree.value == -1) return (evaluateExpressionTree(tree.left) + evaluateExpressionTree(tree.right));
    else if(tree.value == -2) return (evaluateExpressionTree(tree.left) - evaluateExpressionTree(tree.right));
    else if (tree.value == -3) return (evaluateExpressionTree(tree.left) / evaluateExpressionTree(tree.right));
    else if(tree.value == -4) return (evaluateExpressionTree(tree.left) * evaluateExpressionTree(tree.right));
    return tree.value;
  }
}

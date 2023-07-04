import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    ArrayList<BinaryTree> ans = new ArrayList<BinaryTree>();
    inHelper(tree, ans);
    for(int i=0; i<ans.size(); i++) {
      if(ans.get(i)==node && i+1<ans.size()) return ans.get(i+1); 
    }
    return null;
  }

  public static void inHelper(BinaryTree root, List<BinaryTree> pre) {
        if (root == null)
            return;
        inHelper(root.left, pre);
        pre.add(root);
        inHelper(root.right, pre);
    }
}

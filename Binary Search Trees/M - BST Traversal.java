import java.util.*;

class Program {
  public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
    inHelper(tree, array);
    return array;
  }

  public static void inHelper(BST root, List<Integer> pre) {
        if (root == null)
            return;
        inHelper(root.left, pre);
        pre.add(root.value);
        inHelper(root.right, pre);
    }

  public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
    preHelper(tree, array);
    return array;
  }

  public static void preHelper(BST root, List<Integer> pre) {
        if (root == null)
            return;
        pre.add(root.value);
        preHelper(root.left, pre);
        preHelper(root.right, pre);
    }

  public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
    posthelper(tree, array);
    return array;
  }

  public static void posthelper(BST root, List<Integer> pre) {
        if (root == null)
            return;
        posthelper(root.left, pre);
        posthelper(root.right, pre);
        pre.add(root.value);
    }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}

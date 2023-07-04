import java.util.*;

class Program { //Build a min Height BST
  public static BST minHeightBst(List<Integer> array) {
    int size = array.size();
    if(array.size() == 0) return null;
    int mid = size/2;
    BST treenode = new BST(array.get(mid));
    treenode.left = minHeightBst(array.subList(0,mid));
    treenode.right = minHeightBst(array.subList(mid+1,array.size()));
    return treenode;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}

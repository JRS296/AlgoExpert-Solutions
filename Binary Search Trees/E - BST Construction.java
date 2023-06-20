
class Program {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      insertHelper(this, value);
      return this;
    }

    public BST insertHelper(BST btree, int value) {
      if(btree == null) return new BST(value);

      if(value < btree.value) btree.left = insertHelper(btree.left, value);
      else btree.right = insertHelper(btree.right, value);

      return btree;
    }

    public boolean contains(int value) {
      return containsHelper(this, value);
    }

    public boolean containsHelper(BST btree, int value) {
      if(btree == null) return false;

      if(btree.value == value) return true; 
      else if (value < btree.value) return containsHelper(btree.left, value);
      else return containsHelper(btree.right, value);
    }

    public BST remove(int value) {
      removeHelper(this,value);
      return this;
    }

    public BST removeHelper(BST btree, int value) {
      if(btree == null) return btree;

      if(value < btree.value) btree.left = removeHelper(btree.left, value);
      else if (value > btree.value) btree.right = removeHelper(btree.right, value);
      else {
        //If no children -> delete
        if(btree.right == null && btree.left == null) return null;

        //If only 1 child -> replace it with child
        if(btree.left != null && btree.right == null) {
          btree.value = btree.left.value;
          btree.right = btree.left.right;
          btree.left = btree.left.left;
          return btree;
        }
        if(btree.right != null && btree.left == null) {
          btree.value = btree.right.value;
          btree.left = btree.right.left;
          btree.right = btree.right.right;
          return btree;
        }

        //If 2 children -> replace with smallest value in right side of tree
        if(btree.right != null && btree.left != null) {
          int smallest = smallestValue(btree.right);
          btree.value = smallest;
          btree.right = removeHelper(btree.right, smallest);
          return btree;
        }
      }
      return btree;
    }

    public int smallestValue(BST btree) {
      return btree.left == null ? btree.value : smallestValue(btree.left);
    }

    public int largestValue(BST btree) {
      return btree.right == null ? btree.value : largestValue(btree.right);
    }
  }
}


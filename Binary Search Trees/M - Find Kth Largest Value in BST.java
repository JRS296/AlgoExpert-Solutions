import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }
  PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
  
  public int findKthLargestValueInBst(BST tree, int k) {  
    helper(tree);
    
    for(int i=0; i<k-1; i++){
       pq.poll();
    }
    int ans = pq.poll();
    return ans;
  }

  void helper(BST node)
    {
        if (node == null)
            return;
  
        helper(node.left);
        pq.add(node.value);
        helper(node.right);
    }
}

import java.util.*;

class Program {

    static int dp[] = new int[10];

    public static int allKindsOfNodeDepths(BinaryTree root) {
        int ans = helper(root, 0, 0);
        System.out.println(Arrays.toString(dp));
        return ans;
    }

    public static int helper(BinaryTree root, int sum, int depth) {
        if (root == null)
            return 0;
        System.out.println(root.value + " " + sum + " " + depth);
        sum += depth;
        // dp[root.value] = sum + helper(root.left, sum, depth+1) + helper(root.right,
        // sum, depth+1);
        return sum + helper(root.left, sum, depth + 1) + helper(root.right, sum, depth + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}

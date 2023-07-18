class Program {
    int dp[][];

    public int numberOfWaysToTraverseGraph(int width, int height) {
        dp = new int[width][height];
        return helper(width - 1, height - 1);
    }

    public int helper(int i, int j) {
        // System.out.println(i+" "+j);
        if (i == 0 & j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != 0)
            return dp[i][j];

        int up = helper(i, j - 1);
        int left = helper(i - 1, j);

        return dp[i][j] = up + left;
    }
}

import java.util.*;

class Program {
    public static int maxProfitWithKTransactions(int[] prices, int k) {
        int dp[][] = new int[k + 1][prices.length + 1];

        if (prices.length == 0)
            return 0;

        for (int j = 1; j <= k; j++) {
            int MaxSoFar = Integer.MIN_VALUE;
            for (int i = 1; i < prices.length; i++) {
                MaxSoFar = Math.max(MaxSoFar, dp[j - 1][i - 1] - prices[i - 1]);
                dp[j][i] = Math.max(dp[j][i - 1], MaxSoFar + prices[i]);
            }
        }

        for (int x[] : dp) {
            System.out.println(Arrays.toString(x));
        }

        // System.out.println(dp[k][prices.length])

        return dp[k][prices.length - 1];
    }
}

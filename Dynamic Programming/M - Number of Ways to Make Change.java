import java.util.*;

class Program { // Like Coin change 2
  public static int numberOfWaysToMakeChange(int amount, int[] coins) {
    int dp[][] = new int[coins.length + 1][amount + 1];
        for(int i=0; i<=amount; i++) {
            dp[0][i] = 0;
        }

        for(int i=0; i<=coins.length; i++) {
            dp[i][0] = 1;
        }


        for(int i=1; i<=coins.length; i++) {
            for(int j=1; j<=amount; j++) {
                int include = 0;
                int exclude = 0;
                if(j-coins[i-1] < 0) exclude = dp[i-1][j];
                else {
                    include = dp[i][j - coins[i-1]];
                    exclude = dp[i-1][j];
                }

                dp[i][j] = include + exclude;
            }
        }
    return dp[coins.length][amount];
  }
}

import java.util.*;

class Program {
  public static List<List<Integer>> knapsackProblem(int[][] items, int capacity) {
    List<Integer> totalValue = new ArrayList<Integer>();
    List<Integer> finalItems = new ArrayList<Integer>();
    
    int n = items.length;
    int m = capacity;
    int values[] = new int[n+1];
    int weights[] = new int[n+1];

    for(int i=0; i<items.length; i++) {
      values[i+1] = items[i][0];
      weights[i+1] = items[i][1];
    }

    int dp[][] = new int[n+1][m+1];

    for(int i=0; i<=n; i++) {
      for(int j=0; j<=m; j++) {
        int include = 0;
        int exclude = 0;
        if(i==0 || j==0) include = exclude = 0;
        else if(weights[i] <= j) {
          include = values[i] + dp[i-1][j - weights[i]];
          exclude = dp[i-1][j];
        }
        else exclude = dp[i-1][j];
        dp[i][j] = Math.max(include, exclude);
      }
    }
    
    //System.out.println(dp[n][m]);
    totalValue.add(dp[n][m]);

    int i=n; 
    int j=m;
    while (i>0 &&  j>0) {
      if(dp[i][j] == dp[i-1][j]) i--;
      else {
        finalItems.add(i-1);
        j = j-weights[i];
        i--;
      }
    }
    
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    result.add(totalValue);
    result.add(finalItems);
    return result;
  }
}

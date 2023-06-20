package Recursion;

//Standard Fibonacci + added issue of extra variation for maxsteps -> DP

class Program {

  public int staircaseTraversal(int height, int maxSteps) {
    int dp[] = new int[height+1];
    dp[0] = 1;
    dp[1] = 1;
    for(int i=2; i<height+1; i++) {
      if(i<maxSteps) {
        for(int k=0; k<i; k++) {
          dp[i] += dp[k];
        }
      } else {
        for(int j=1; j<=maxSteps; j++) {
        //System.out.println(i + " " +(i-j) + " " + j); 
        dp[i] += dp[i-j];
        }
      }
      
    }
    //System.out.println(Arrays.toString(dp));
    return dp[height];
  }
}


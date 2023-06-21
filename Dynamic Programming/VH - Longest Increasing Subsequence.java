import java.util.*;

class Program {
  public static List<Integer> longestIncreasingSubsequence(int[] nums) {
      int dp[] = new int[nums.length];
      List<Integer> ans = new ArrayList<Integer>();
        Arrays.fill(dp, 1);
        for(int i=nums.length-1; i>-1; i--) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] < nums[j]) dp[i] = Math.max(dp[i], 1+dp[j]);
            }
        }

        int i = Arrays.stream(dp).max().getAsInt();
        int ptr = 0;
        while(i>0) {
          if(dp[ptr]!=i) {
            ptr++;
            continue;
          } else if (dp[ptr]==i) {
            ans.add(nums[ptr]);
            i--;
          }
          ptr++;
        }
        // System.out.println(Arrays.toString(dp));
        // System.out.println(Arrays.toString(nums));
        // System.out.println(ans);
    return ans;
  }
}

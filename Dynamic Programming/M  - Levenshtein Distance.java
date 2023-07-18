import java.util.*;

class Program {
    public static int levenshteinDistance(String str1, String str2) {
        int dp[][] = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i < str1.length() + 1; i++) {
            for (int j = 0; j < str2.length() + 1; j++) {
                dp[0][j] = j;
            }
            dp[i][0] = i;
        }

        for (int i = 1; i < str1.length() + 1; i++) {
            for (int j = 1; j < str2.length() + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        for (int x[] : dp)
            System.out.println(Arrays.toString(x));
        return dp[str1.length()][str2.length()];
    }
}

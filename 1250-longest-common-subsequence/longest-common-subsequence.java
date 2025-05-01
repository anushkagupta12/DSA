class Solution {
    private int helper(String X, String Y, int m, int n, int dp[][]) {
        // if(m == 0 || n == 0) {
        //     return 0;
        // }
        for(int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for(int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]); 
                }
            }
        }
        return dp[m][n];
        // if(dp[m][n] != -1) {
        //     return dp[m][n];
        // }
        // if(X.charAt(m - 1) == Y.charAt(n - 1)) {
        //      return 1 + helper(X,Y, m - 1, n - 1,dp); 
        // } 
        // return Math.max(helper(X, Y, m - 1, n,dp) , helper(X,Y, m, n - 1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(text1, text2, m,n, dp);

        // return ans;
    }
}
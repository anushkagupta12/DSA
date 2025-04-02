class Solution {

    private int fun(String X, String Y, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) { // Check if already computed
            return dp[n][m];
        }

        if (X.charAt(n - 1) == Y.charAt(m - 1)) {
            dp[n][m] = 1 + fun(X, Y, n - 1, m - 1, dp); // 1 is added for the matched char
        } else {
            dp[n][m] = Math.max(fun(X, Y, n, m - 1, dp), fun(X, Y, n - 1, m, dp));
        }
        return dp[n][m] ;
    }

    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = fun(text1, text2, n, m, dp);
        return ans;
    }
}
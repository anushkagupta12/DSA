class Solution {
    private String reverse(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }

    private int LCS(String s, String t, int m, int n, int[][]dp) {
        // if (m == 0 || n == 0) {
        //     return 0;
        // }
        for(int i = 0; i < m; i++) {
            dp[i][n] = 0;
        }
        for(int i = 0; i < n; i++) {
            dp[m][i] = 0;
        }
        if(dp[m][n] != -1) {
            return dp[m][n];
        }
        // if (s.charAt(m - 1) == t.charAt(n - 1)) {
        //    dp[m][n] = 1 + LCS(s, t, m - 1, n - 1, dp);
        // } else {
        // dp[m][n] =  Math.max(LCS(s, t, m - 1, n, dp), LCS(s, t, m, n - 1, dp));
        // }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return 1+dp[m][n];
    }

    public int longestPalindromeSubseq(String s) {
        String t = reverse(s);
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for(int arr[] : dp) {
            Arrays.fill(arr,-1);
        }
        int ans = LCS(s, t, s.length(), t.length(), dp);
        return ans;

    }
}
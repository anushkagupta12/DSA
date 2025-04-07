class Solution {

    public boolean f(int ind, int k, int[] nums, int[][] dp) {
        if(ind == 0) return nums[0] == k;
        if(k == 0) return true;
        if(dp[ind][k] != -1) return dp[ind][k] == 1 ;

        boolean notTake = f(ind - 1, k, nums, dp);
        boolean take = false;
        if(k >= nums[ind]) take = f(ind - 1, k - nums[ind] , nums, dp);
         dp[ind][k] = notTake || take ? 1 : 0;
        return notTake || take;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
       
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //  int dp[][] = new int[nums.length][sum/2 + 1];
        
        
        if(sum % 2 != 0) return false;

        int k = sum / 2;
        int[][] dp = new int[nums.length][k + 1];
         for(int arr[] : dp) {
            Arrays.fill(arr,-1);
         }
        
        
       return f(nums.length - 1, k, nums, dp);
    }
}
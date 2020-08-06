package Leetcode416;

public class Solution {

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int i = 0 ; i <nums.length;i++){
            sum += nums[i];
        }

        if(sum %2  != 0) return false;

        sum /= 2;

        boolean[][] dp = new boolean[nums.length+1][sum+1];

        for(int i = 0 ; i <nums.length+1;i++){
            for(int j = 0;j<sum+1;j++) {
                if (j == 0) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = false;
                }
            }
        }


        for(int i = 1 ; i <=nums.length;i++){
            for(int j = 1;j<=sum;j++){
                if(j - nums[i-1] <0){ //背包容量不够
                    dp[i][j] = dp[i-1][j];
                }else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }

        return dp[nums.length][sum];
    }
}

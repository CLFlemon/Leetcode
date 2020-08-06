package Leetcode312;

public class Solution {

    public int maxCoins(int[] nums) {

        int len = nums.length;

        int[] point = new int[len+2];
        point[0] = point[len+1]  = 1;

        for(int i = 1 ; i <= len;i++){
            point[i] = nums[i-1];
        }

        int[][] dp = new int[len+2][len+2];

        for(int i = len+1; i >= 0 ; i--){
            for(int j = i-1 ; j<len+2;j++){
                for(int k = i+1;k< j;k++){

                    dp[i][j] = Math.max(dp[i][j],
                                        dp[i][k]+dp[k][j]+point[k]*point[i]*point[j]);

                }
            }
        }

        return dp[0][len+1];
    }
}

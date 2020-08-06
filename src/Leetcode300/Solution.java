package Leetcode300;

public class Solution {

    public int lengthOfLIS(int[] nums) {

        int[] dp =  new int[nums.length];

        dp[0] = 1;

        for(int i = 1 ; i < nums.length;i++){
            int temp = 0;
            for(int j = 0; j < i;j++){
                if(nums[i] > nums[j]) {
                    temp = Math.max(temp, dp[j]);
                }
            }
            dp[i] = temp+1;
        }

        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}

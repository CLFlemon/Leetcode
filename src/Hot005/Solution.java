package Hot005;

public class Solution {
    public String longestPalindrome(String s){
        int len = s.length();
        if(len <2) return  s;

        boolean[][] dp = new boolean[len][len];
        int max = 1;
        int begin = 0;

        for(int i = 0;i<len;i++) dp[i][i] = true;
        char[] chars = s.toCharArray();

        for(int j = 1; j<len;j++){
            for(int i = 0; i<j;i++){
                if(chars[i] != chars[j]){
                    dp[i][j] = false;
                }else {
                    if(j-i <3)  dp[i][j] = true;
                    else dp[i][j] = dp[i+1][j-1];
                }


                if(dp[i][j] == true && j-i+1 > max){
                    max = j-i+1;
                    begin = i;

                }
            }
        }
        return s.substring(begin,begin+max);
    }
}

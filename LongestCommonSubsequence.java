//Standard problem : This JAVA code gets the length of the longest common subsequence following the dynamic programming approach.

class Solution {
    Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        char[] x= text1.toCharArray();
        char[] y= text2.toCharArray();
        int xi = x.length -1;
        int yi = y.length -1;
        
        dp = new Integer[xi +1][yi +1];
        
        return helper(x, y, xi, yi);
        
    }
    private int helper(char[] x, char[] y, int xi, int yi){
        if(xi <0 || yi < 0){
            return 0;
        }
        if(dp[xi][yi] != null){
            return dp[xi][yi];
        }
        
        if(x[xi] == y[yi]){
            dp[xi][yi] =1+ helper(x, y, xi-1, yi -1);
        }
        else
            dp[xi][yi] =Math.max(helper(x, y, xi-1, yi), helper(x, y, xi, yi -1));
        
        return dp[xi][yi];
    }   
}

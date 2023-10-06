class Solution {
    public int integerBreak(int n) {
         int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            int maxProduct = 0;
            for (int j = 1; j < i; j++) {
                int product = Math.max(j * dp[i - j], j * (i - j));
                maxProduct = Math.max(maxProduct, product);
            }
            dp[i] = maxProduct;
        }
        return dp[n];
    }
}
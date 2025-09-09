public class SecretSharable {

    final int MOD = 1_000_000_007;

    public int solve(int n, int delay, int forget, Integer[] dp) {

        if(n == 1) return 1;

        if(dp[n] != null) return dp[n];

        int result = 0;

        for(int prev = n-forget+1; prev <= n-delay; prev++) {
            if(prev > 0) {
                result = (result + solve(prev, delay, forget, dp)) % MOD;
            }
        }

        return dp[n] = result;

    }

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int total = 0;
        Integer[] dp = new Integer[n+1];

        for(int day = n-forget+1; day <= n; day++) {
            if(day>0) {
                total = (total + solve(day, delay, forget, dp)) % MOD;
            }
        }


        return total;

    }
}

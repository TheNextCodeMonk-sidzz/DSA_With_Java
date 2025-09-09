package Leetcode_daily;
//https://leetcode.com/problems/number-of-people-aware-of-a-secret/description/?envType=daily-question&envId=2025-09-09
public class Number_of_people_secret {

    public int peopleAwareOfSecret(int n, int delay, int forget) {

        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        dp[1] = 1;

        long shareable = 0;

        for (int day = 2; day <= n; day++) {

            if (day - delay >= 1) {
                shareable = (shareable + dp[day - delay]) % MOD;
            }


            if (day - forget >= 1) {
                shareable = (shareable - dp[day - forget] + MOD) % MOD;
            }


            dp[day] = shareable;
        }


        long result = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) {
                result = (result + dp[i]) % MOD;
            }
        }

        return (int) result;
    }
}

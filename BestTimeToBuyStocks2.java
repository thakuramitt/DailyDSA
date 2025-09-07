//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

public class BestTimeToBuyStocks2 {
//     Without using DP
    public static int solve(int[] arr) {
        int currBuy = arr[0];
        int profit = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < currBuy) {
                currBuy = arr[i];
            } else {
                profit += arr[i] - currBuy;
                currBuy = arr[i];
            }
        }
        return profit;
    }

//     Using Dynamic Programming

    public static int solve(int[] prices, Integer[][] dp, int idx, int canBuy) {

        if(idx == prices.length) return 0;

        if(dp[idx][canBuy] != null) return dp[idx][canBuy];

        int skip = solve(prices, dp, idx+1, canBuy);

        if(canBuy == 1) {
            int buy = -prices[idx] + solve(prices, dp, idx+1, 0);
            return dp[idx][canBuy] = Math.max(buy, skip);
        } else {
            int sell = prices[idx] + solve(prices, dp, idx+1, 1);
            return dp[idx][canBuy] = Math.max(sell, skip);
        }
    }

    public static void main(String[] args) {

        int[] arr = {7,6,4,3,1};
        int n = arr.length;
        Integer[][] dp = new Integer[n][2];

        System.out.println(solve(arr, dp, 0, 1));

    }
}

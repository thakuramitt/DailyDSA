// https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1


// Brute Force - Exponential Time Complexity
public class StocksWithMultiple {
    public static int getProfit(int[] prices) {
        int res = 0;
        int i = 0;
        int n = prices.length;
        int localMinima = prices[0];
        int localMaxima = prices[0];

        while(i < n-1) {

            while(i < n-1 && prices[i] >= prices[i+1]) i++;
            localMinima = prices[i];

            while(i < n-1 && prices[i] <= prices[i+1]) i++;
            localMaxima = prices[i];

            res += localMaxima - localMinima;

        }
        return res;
    }
//    public static int getProfit(int[] prices, int start, int end) {
//
//        int res = 0;
//
//        for(int i = start; i < end; i++) {
//            for(int j = i+1; j <= end; j++) {
//                if(prices[j] > prices[i]) {
//                    int curr = prices[j] - prices[i] + getProfit(prices, start, i-1) + getProfit(prices, j+1, end);
//                    res = Math.max(res, curr);
//                }
//
//            }
//        }
//
//        return res;
//
//    }
    public static void main(String[] args) {

        int[] prices = {100, 180, 260, 310, 40, 535, 695};

        int ans = getProfit(prices);

        System.out.println(ans);
    }
}

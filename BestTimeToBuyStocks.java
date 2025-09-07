// https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


// Brute Force - Exponential Time Complexity
public class BestTimeToBuyStocks {
//    public static int getProfit(int[] prices) {
//        int res = 0;
//        int i = 0;
//        int n = prices.length;
//        int localMinima = prices[0];
//        int localMaxima = prices[0];
//
//        while(i < n-1) {
//
//            while(i < n-1 && prices[i] >= prices[i+1]) i++;
//            localMinima = prices[i];
//
//            while(i < n-1 && prices[i] <= prices[i+1]) i++;
//            localMaxima = prices[i];
//
//            res += localMaxima - localMinima;
//
//        }
//        return res;
//    }


    //Optimized version : Linear time

    public static int getProfit(int[] prices) {

        int currBuy = prices[0];
        int currProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < currBuy) {
                currBuy = prices[i];
            } else if(prices[i] - currBuy > currProfit) {
                currProfit = prices[i] - currBuy;
            }
        }

        return currProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int ans = getProfit(prices);

        System.out.println(ans);
    }
}

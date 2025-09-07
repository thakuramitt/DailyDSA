//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

public class BestTimeToBuyStocks2 {
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
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(solve(arr));

    }
}

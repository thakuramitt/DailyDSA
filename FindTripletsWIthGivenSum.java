//https://www.geeksforgeeks.org/dsa/print-all-triplets-with-given-sum/

import java.util.Arrays;

// Non Leetcode problem

public class FindTripletsWIthGivenSum {
    public static int solve(int[] prices, int target) {
        int currSum = 0;

        Arrays.sort(prices);

        for(int left = 0; left < prices.length - 2; left++) {

            if(left > 0 && prices[left] == prices[left - 1]) continue;
            int right = left + 1;
            int last = prices.length -1;

            while(right < last) {
                int curr = prices[left] + prices[right] + prices[last];
                if(curr == target) {
                    currSum++;
                    right++;
                    last--;
                }
                else if (curr < target) right++;
                else last--;

                while(right < last && prices[right] == prices[right-1]) right++;
                while(right < last && prices[last] == prices[last+1]) last--;
            }
        }

        return currSum;

    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 1, 0, 5};
        int target = 1;

        System.out.println(solve(arr, target));

    }
}

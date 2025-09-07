//https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> solve(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for(int left = 0; left < n-2; left++) {

            if(left > 0 && arr[left] == arr[left-1]) continue;
            int right = left + 1;
            int last = n-1;

            while(right < last) {

                int currSum = arr[left] + arr[right] + arr[last];

                if(currSum == 0) {

                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                    temp.add(arr[last]);
                    res.add(temp);
                    right++;
                    last--;

                    while(right < last && arr[right] == arr[right - 1]) right++;
                    while(right < last && arr[last] == arr[last + 1]) last--;
                } else if (currSum < 0) {
                    right++;
                } else {
                    last--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> res = solve(arr);

        System.out.println(res);

    }
}

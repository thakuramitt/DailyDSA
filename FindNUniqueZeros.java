//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=daily-question&envId=2025-09-07

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNUniqueZeros {
    public static int[] solve(int n) {
        if(n == 1) return new int[] {0};

        List<Integer> temp = new ArrayList<>();
        if(n % 2 != 0) temp.add(0);

        int helper = 1;

        while(temp.size() < n) {
            temp.add(helper);
            temp.add(-helper);
            helper++;
        }

        int[] res = temp.stream().mapToInt(Integer::intValue).toArray();

        return res;
    }

    public static void main(String[] args) {
        int n = 16;

        System.out.println(Arrays.toString(solve(n)));
    }
}

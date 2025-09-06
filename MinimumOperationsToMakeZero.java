//https://leetcode.com/problems/minimum-operations-to-make-array-elements-zero/description/?envType=daily-question&envId=2025-09-06

// Need to revisit this problem again

public class MinimumOperationsToMakeZero {
    public static int calculateRange(int l, int r) {
        int L = 1;
        int S = 1;
        int totalSteps = 0;

        while(L <= r) {
            int R = 4*L - 1;
            int start = Math.max(L, l);
            int end = Math.min(R, r);

            if(start <= end) {
                totalSteps += (end - start + 1) * S;
            }

            S++;
            L = L * 4;
        }

        return totalSteps;
    }

    public static void main(String[] args) {

        int[][] queries = {{2,6}};
        int result = 0;

        for(int[] query : queries) {
            int l = query[0];
            int r = query[1];

            int steps = calculateRange(l, r);

            result += (steps+1) / 2;
        }
        System.out.println(result);
    }
}

//https://leetcode.com/problems/minimum-operations-to-make-the-integer-zero/?envType=daily-question&envId=2025-09-05

public class MinimumOperations {
    public static int makeTheIntegerZero(int num1, int num2) {

        for(int k = 1; k <= 60; k++) {
            long curr = (long) num1 - ((long) k * num2);

            if (curr < 0) return -1;

            if(Long.bitCount(curr) <= k && k <= curr) return k;

        }
        return -1;
    }

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 7;

        System.out.println(makeTheIntegerZero(num1, num2));


    }
}

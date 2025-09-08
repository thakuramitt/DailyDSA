//https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/?envType=daily-question&envId=2025-09-08

public class ConvertIntToZero {

    public boolean containsZero(int n) {

        while(n > 0) {
            if(n % 10 == 0) return true;
            n = n / 10;
        }
        return false;
    }

    public int[] getNoZeroIntegers(int n) {

        for(int i = 1; i < n; i++) {
            int j = n-i;
            if(!containsZero(i) && !containsZero(j)) {
                return new int[] {i, j};
            }
        }
        return new int[] {};
    }
}

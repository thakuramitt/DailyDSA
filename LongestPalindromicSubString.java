//https://leetcode.com/problems/longest-palindromic-substring/description/

public class LongestPalindromicSubString {
    public static int isValid(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        String s = "babad";
        int left = 0;
        int right = 0;

        int n = s.length();
        for(int i = 0; i < n; i++) {
            int oddLen = isValid(s, i, i);
            int evenLen = isValid(s, i, i+1);
            int currLen = Math.max(oddLen, evenLen);

            if(currLen > right - left + 1) {
                left = i - (currLen - 1) / 2;
                right = i + (currLen) / 2;
            }
        }

        System.out.println(s.substring(left, right+1));

    }
}

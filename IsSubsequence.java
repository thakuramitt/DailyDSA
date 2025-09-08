//https://leetcode.com/problems/is-subsequence/description/

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int l = s.length();
        int r = t.length();
        int i = 0;
        int j = 0;

        while(i < l && j < r) {
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }

        if(i == l) return true;

        return false;

    }
}

import java.util.*;

public class SortVowelsinAString {
    public static String solve(String s) {
        int n = s.length();
        List<Character> vowels = new ArrayList<>();
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));

        for(char ch : s.toCharArray()) {
            if(vowelSet.contains(ch)) vowels.add(ch);
        }

        Collections.sort(vowels);

        int idx = 0;
        StringBuilder str = new StringBuilder(s);

        for(int i = 0; i < n; i++) {
            if(vowelSet.contains(s.charAt(i))) {
                str.setCharAt(i, vowels.get(idx++));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {

        String s = "lEetcOde";

        System.out.println(solve(s));
    }
}

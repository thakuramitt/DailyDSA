//https://leetcode.com/problems/vowels-game-in-a-string/description/

public class OddEvenVowelString {
    Set<Character> charSet = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
    public int getCount(String s) {
        int count = 0;
        for(char ch : s.toCharArray()) {
            if(charSet.contains(ch)) {
                count++;
            }
        }
        return count;
    }
    public boolean doesAliceWin(String s) {

        int count = getCount(s);

        return count > 0? true : false;

    }
}

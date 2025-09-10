//https://leetcode.com/problems/minimum-number-of-people-to-teach/description/?envType=daily-question&envId=2025-09-10

import java.util.HashSet;
import java.util.Set;

public class PeopleToTeach {

    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {

        Set<Integer> sadUser = new HashSet<>();

        for(int[] frnd : friendships) {
            int u = frnd[0] - 1;
            int v = frnd[1] - 1;

            Set<Integer> langSet = new HashSet<>();
            for(int lang : languages[u]) {
                langSet.add(lang);
            }

            boolean canTalk = false;
            for(int lang : languages[v]) {
                if(langSet.contains(lang)) {
                    canTalk = true;
                    break;
                }
            }

            if(!canTalk) {
                sadUser.add(u);
                sadUser.add(v);
            }
        }

        int[] languageCount = new int[n + 1];
        int mostKnownLang = 0;

        for (int user : sadUser) {
            for (int lang : languages[user]) {
                languageCount[lang]++;
                mostKnownLang = Math.max(mostKnownLang, languageCount[lang]);
            }
        }

        return sadUser.size() - mostKnownLang;

    }
}

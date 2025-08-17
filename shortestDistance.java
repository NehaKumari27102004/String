package Array.String;
import java.util.*;

public class shortestDistance {
    static int shortestDistance(ArrayList<String> s,
                                String word1, String word2) {
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        // Traverse the string
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1))
                d1 = i;
            if (s.get(i).equals(word2))
                d2 = i;
            if (d1 != -1 && d2 != -1)
                ans = Math.min(ans, Math.abs(d1 - d2));
        }

        // Return the answer
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> S =
                new ArrayList<>(Arrays.asList("the",
                        "quick", "brown", "fox", "quick"));

        String word1 = "the", word2 = "fox";

        System.out.println(shortestDistance(S, word1, word2));
    }
}

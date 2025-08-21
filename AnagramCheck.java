package Array.String;

import java.util.*;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2))
            System.out.println(" The strings are Anagrams.");
        else
            System.out.println(" The strings are NOT Anagrams.");

        sc.close();
    }
}

package Array.String;

public class VowelConsonantCount {
    public static void countVC(String s) {
        int v = 0, c = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (ch >= 'a' && ch <= 'z') c++;
        }
        System.out.println("Vowels=" + v + ", Consonants=" + c);
    }
    public static void main(String[] args) {
        String str = "hello neha I anm happy";
        countVC(str);
    }
}

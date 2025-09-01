class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int) num * sign;
    }
}

public class StringToInteger {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myAtoi("42"));
        System.out.println(sol.myAtoi("   -042"));
        System.out.println(sol.myAtoi("1337c0d3"));
        System.out.println(sol.myAtoi("0-1"));
        System.out.println(sol.myAtoi("words and 987"));
        System.out.println(sol.myAtoi("91283472332"));
    }
}

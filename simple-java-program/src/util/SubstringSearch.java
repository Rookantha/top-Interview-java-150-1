package util;

public class SubstringSearch {
    public  static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return kmpSearch(haystack, needle);
        }

    private static int kmpSearch(String text, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0, j = 0; // `i` for text, `j` for pattern

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) return i - j; // Found match
            } else if (j > 0) {
                j = lps[j - 1]; // Jump using LPS table
            } else {
                i++; // Move in text
            }
        }
        return -1; // Not found
    }private static int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0, i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1]; // Jump back in LPS table
            } else {
                lps[i++] = 0;
            }
        }
        return lps;

    }
}

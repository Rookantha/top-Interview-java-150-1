package Util;

public class SubsequenceCheck {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Traverse both strings with two pointers
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move pointer for s
            }
            j++; // Always move pointer for t
        }

        // If we have traversed all of s, it's a subsequence of t
        return i == s.length();
    }
}

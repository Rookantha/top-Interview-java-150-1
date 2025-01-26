package Util;

public class FindNeedle {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        // Find the first occurrence of needle in haystack
        return haystack.indexOf(needle);
    }
}

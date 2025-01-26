package Util;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0; // Length of the last word
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters in the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

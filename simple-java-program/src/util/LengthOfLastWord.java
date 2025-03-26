package util;

public class LengthOfLastWord {

    // For performance & readability, the trim() + lastIndexOf() method is better.
    public static int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int lastSpace = s.lastIndexOf(' '); // Find the last space
        return s.length() - lastSpace - 1; // Calculate the length of the last word
    }

    //Best Optimized Solution for Large Input (Single Pass, No Extra Memory
    public static int manualIterationLengthOfLastWord(String s) {

            int i = s.length() - 1, length = 0;

            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // Count last word's length
            while (i >= 0 && s.charAt(i) != ' ') {
                length++;
                i--;
            }

            return length;
        }
}

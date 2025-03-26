package util;

public class ReverseWords {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return ""; // Handle null or empty input
        }

        // Trim and split words efficiently
        String[] words = s.trim().split("\\s+");

        // Use StringBuilder to reverse words in-place
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        // Remove the last extra space before returning
        return result.toString().trim();

    }

}

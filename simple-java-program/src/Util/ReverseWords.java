package Util;

public class ReverseWords {
    public String reverseWords(String s) {
        // Trim the input string to remove leading/trailing spaces
        s = s.trim();

        // Split the string by spaces, handling multiple spaces between words
        String[] words = s.split("\\s+");

        // Reverse the words array
        StringBuilder reversed = new StringBuilder();

        // Join the words into a single string with a single space between each word
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }

        return reversed.toString();
    }
}

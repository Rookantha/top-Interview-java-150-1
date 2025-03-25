import util.*;

import java.util.Random;
import java.util.Scanner;

import static util.MajorityElement.majorityElement;

public class Main {
    public static void main(String[] args) {

        // Factorial
        int factorialInput = 5;
        System.out.println("Factorial of " + factorialInput + " is: " + FactorialOperations.calculateFactorial(factorialInput));

        // Fibonacci
        int fibonacciCount = 10;
        FibonacciOperation.printFibonacci(fibonacciCount);

        IncrementLargeInteger incrementLargeInteger = new IncrementLargeInteger();

        // Test cases
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};

        // Output results
        System.out.println(java.util.Arrays.toString(incrementLargeInteger.plusOne(digits1))); // Output: [1, 2, 4]
        System.out.println(java.util.Arrays.toString(incrementLargeInteger.plusOne(digits2))); // Output: [4, 3, 2, 2]
        System.out.println(java.util.Arrays.toString(incrementLargeInteger.plusOne(digits3))); // Output: [1, 0]

        // Random number
        Random random = new Random();
        System.out.println("Random number: " + random.nextInt(101));

        // Length Of Last Word
        System.out.println(LengthOfLastWord.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(LengthOfLastWord.lengthOfLastWord("luffy is still joyboy")); // Output: 6

        // Find Majority Element
        int[] numsMajorityElements = {3, 2, 3};
        int result = majorityElement(numsMajorityElements);
        System.out.println("The majority element is: " + result);

        // GCD
        int gcd1 = 24, gcd2 = 36;
        System.out.println("GCD of " + gcd1 + " and " + gcd2 + " is: " + MathUtil.findGCD(gcd1, gcd2));

        // Perfect square
        int square = 16;
        System.out.println(square + (MathUtil.isPerfectSquare(square) ? " is a perfect square." : " is not a perfect square."));



        // Sum of natural numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Sum of natural numbers up to " + n + " is: " + NaturalNumberOperations.calculateSum(n));

        // PalindromeNumber
        System.out.println(PalindromeNumber.isPalindrome(121)); // Output: true
        System.out.println(PalindromeNumber.isPalindrome(-121)); // Output: false
        System.out.println(PalindromeNumber.isPalindrome(10)); // Output: false

        // Palindrome String
        System.out.println(PalindromeString.isPalindrome("hvjhv")); // Output: true

        // Input array and value to remove
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        // Create an instance of RemoveElement
        RemoveElement obj = new RemoveElement();

        // Call the removeElement method
        int k = obj.removeElement(nums, val);

        // Print the results
        System.out.println("New length: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }


        //Sub sequence Check

        // Example 1
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Is '" + s1 + "' a Sub sequence  of '" + t1 + "'? " + SubsequenceCheck.isSubsequence(s1, t1)); // Output: true

        // Example 2
        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Is '" + s2 + "' a Sub sequence  of '" + t2 + "'? " + SubsequenceCheck.isSubsequence(s2, t2)); // Output: false

        // Find Substring Search
        // Example 1:
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Is '" + needle1 + "' a substring of '" + haystack1 + "'? " + SubstringSearch.strStr(haystack1, needle1));


        // Example 2:
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Is '" + needle2 + "' a substring of '" + haystack2 + "'? " + SubstringSearch.strStr(haystack2, needle2));



        TwoSum twoSum = new TwoSum();

        // Example 1
        int[] numsTS = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum.twoSum(numsTS, target1);
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] numsTS2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum.twoSum(numsTS2, target2);
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] numsTS3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum.twoSum(numsTS3, target3);
        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");

        ///Remove Duplicates

        // Example 1:
        int[] numsRD1 = {1, 1, 2};
        int k1 = RemoveDuplicates.removeDuplicates(numsRD1);
        System.out.println("Number of unique elements: " + k1);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(numsRD1[i] + " ");
        }
        System.out.println();

        // Example 2:
        int[] numsRD2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = RemoveDuplicates.removeDuplicates(numsRD2);
        System.out.println("Number of unique elements: " + k2);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(numsRD2[i] + " ");
        }
        System.out.println();

        StockProfit stockProfit = new StockProfit();

        // Example 1:
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " + stockProfit.maxProfit(prices1)); // Output: 5

        // Example 2:
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum profit: " + stockProfit.maxProfit(prices2)); // Output: 0

        //Reverse Words
        ReverseWords reverseWords = new ReverseWords();

        // Example 1:
        String string = "the sky is blue";
        System.out.println(reverseWords.reverseWords(string)); // Output: "blue is sky the"

        // Example 2:
        String string1 = "  hello world  ";
        System.out.println(reverseWords.reverseWords(string1)); // Output: "world hello"

        // Example 3:
        String string2 = "a good   example";
        System.out.println(reverseWords.reverseWords(string2)); // Output: "example good a"











        //Square Root
        SquareRoot squareRoot = new SquareRoot();

        // Test cases
        System.out.println(squareRoot.mySqrt(4)); // Output: 2
        System.out.println(squareRoot.mySqrt(8)); // Output: 2
        System.out.println(squareRoot.mySqrt(16)); // Output: 4
        System.out.println(squareRoot.mySqrt(1)); // Output: 1
        System.out.println(squareRoot.mySqrt(0)); // Output: 0


        // Prime
        int primeNumber = 29;
        System.out.println(primeNumber + (PrimeOperations.isPrime(primeNumber) ? " is a prime number." : " is not a prime number."));
        System.out.println("print Primes Up To ------");
        PrimeOperations.printPrimesUpTo(100);


    }



















}
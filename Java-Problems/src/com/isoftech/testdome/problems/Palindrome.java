package com.isoftech.testdome.problems;

/**
 * Palindrome Class is to identify the given text is Palindrome or not.
 * 
 * @author Mohamed Yusuff
 *
 * A palindrome is a word that reads the same backward or forward.
 * 
 * Write a function that checks if a given word is a palindrome. Character case should be ignored.
 * 
 * For example, isPalindrome("Deleveled") should return true as character case should be ignored, resulting in
 * "deleveled", which is a palindrome since it reads the same backward and forward.
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
        boolean isPalindrome = false;
        try {
           isPalindrome = word.equalsIgnoreCase((new StringBuilder(word)).reverse().toString());
        } catch (Exception exc) {
            throw new UnsupportedOperationException("Invalid Implementation.");    
        }
        return isPalindrome;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}

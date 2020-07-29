package core.basesyntax;

public class Palindrome {

    public boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}
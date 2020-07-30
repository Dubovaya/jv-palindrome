package core.basesyntax;

public class Palindrome {

    public boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder result = new StringBuilder(text);
        return text.equals(result.reverse().toString());
    }
}
package core.basesyntax;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W", "");
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();

        return text.equalsIgnoreCase(invertedText);

    }
}
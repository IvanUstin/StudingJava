package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithStringsMethods {

    private final static String EMPTY_STRING = "";
    private final static String WORDS = "\\w+";
    private final static String SPACES = " +";

    //return set of indexes of the largest matches, first solve of the first task before I decided to
    //watch the term again
    public static Set<Integer> indexOfTheLargestMatch (String pattern, String string) {
        Pattern currentPattern = Pattern.compile(pattern);
        Matcher matcher = currentPattern.matcher(string);
        Set<Integer> setOfIndexes = new HashSet<>();
        int maxLength = 0;
        while (matcher.find()) {
            int length = matcher.group().length();
            if (length > maxLength) {
                maxLength = length;
                setOfIndexes.clear();
                setOfIndexes.add(matcher.start());
            } else if (length == maxLength) {
                setOfIndexes.add(matcher.start());
            }
        }
        return setOfIndexes;
    }

    public static int lengthOfTheLargestMatch (String pattern, String string) {
        Pattern currentPattern = Pattern.compile(pattern);
        Matcher matcher = currentPattern.matcher(string);
        int maxLength = 0;
        while (matcher.find()) {
            int length = matcher.group().length();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static boolean isPalindrome (String string) {
        StringBuilder Palindrome = new StringBuilder(string);
        return string.equals(Palindrome.reverse().toString());
    }

    //successor of "quantityOfDigitsInTheString" method
    public static int quantityOfSmthInTheString (String pattern, String string) {
        Pattern currentPattern = Pattern.compile(pattern);
        Matcher matcher = currentPattern.matcher(string);
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    public static String repeatEverySymbolOfTheString (String string, int times) {
        String doubleSymbols = EMPTY_STRING;
        for (char ch :
                string.toCharArray()) {
            doubleSymbols = doubleSymbols.concat(String.valueOf(ch).repeat(times));
        }
        return doubleSymbols;
    }

    public static String deleteRepeatedSymbolsAndSpaces (String string) {
        //spaces
        string = string.replaceAll(SPACES,EMPTY_STRING);

        //forming outputString
        String outputString = EMPTY_STRING;
        while (string.length() > 0) {
            String regex = String.valueOf(string.charAt(0));
            outputString = outputString.concat(regex);
            string = string.replaceAll(regex,EMPTY_STRING);
        }
        return outputString;
    }

    public static String showTheFirstLargestWord (String string) {
        Pattern currentPattern = Pattern.compile(WORDS);
        Matcher matcher = currentPattern.matcher(string);
        int maxQuantity = 0;
        String outputString = EMPTY_STRING;
        while (matcher.find()) {
            int length = matcher.group().length();
            if (length > maxQuantity) {
                maxQuantity = length;
                outputString = matcher.group();
            }
        }
        //"not to handle the specific events" solved by returning the empty string
        return quantityOfSmthInTheString(outputString,string) == 1 ? outputString : EMPTY_STRING;
    }
}

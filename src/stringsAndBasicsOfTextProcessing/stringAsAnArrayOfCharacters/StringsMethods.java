package stringsAndBasicsOfTextProcessing.stringAsAnArrayOfCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsMethods {

    private final static String UNDERSCORE = "_";
    private final static String SPACE = " ";

    public static String wordTo_snake_case(String camelCase) {
        String replacement = UNDERSCORE;
        StringBuilder snakeCase = new StringBuilder(camelCase);
        Pattern upCase = Pattern.compile("[A-Z]");
        Matcher matcher = upCase.matcher(snakeCase);
        int i = 0;
        while (matcher.find(i)) {
            i = matcher.start();
            if (i != 0) snakeCase.insert(i,replacement);
            i += replacement.length() + matcher.group().length();
        }
        return snakeCase.toString().toLowerCase();
    }

    public static String[] arrayOfWordsTo_snake_case(String[] camelCase) {
        String[] snake_case = new String[camelCase.length];
        int i = 0;
        for (String variable :
                camelCase) {
            snake_case[i] = wordTo_snake_case(variable);
            i++;
        }
        return snake_case;
    }

    public static int quantityOfDigitsInTheString (String string) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(string);
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    //count numbers if their format equals abc, a.bc or a,bc
    public static int quantityOfNumbersInTheString (String string) {
        Pattern pattern = Pattern.compile("\\d+.?\\d+");
        Matcher matcher = pattern.matcher(string);
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }

    public static String deleteExtraSpaces (String string) {
        string = string.strip();
        StringBuilder handledString = new StringBuilder(string);
        Pattern pattern = Pattern.compile("\\p{Blank}+");
        Matcher matcher = pattern.matcher(handledString);
        int start = 0;
        while (matcher.find(start)) {
            start = matcher.start();
            handledString.replace(start,start++ + matcher.group().length(),SPACE);
        }
        return handledString.toString();
    }
}

package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

import stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder.WorkingWithStringsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAuxiliaryMethods {
    public final static String SPACE_BAR = " ";
    public final static String COURAGE_RETURN = "\r\n";
    public final static String EMPTY_STRING = "";
    public final static String SPLIT_WORDS = "[ .!?]+";
    public final static String SENTENCES = "[^\r\n ][^?!.]+[.!?]";
    public final static String PUNCTUATION = "\\p{Punct}";
    private final static Pattern SENTENCE_PATTERN = Pattern.compile(SENTENCES);

    public static int quantityOfSentences(String paragraph) {
        return WorkingWithStringsMethods.quantityOfSmthInTheString(SENTENCES, paragraph);
    }

    public static String changeTheCaseOfDefinedLetter(String firstWord, int index, boolean toUpperCase) {

        //take needed letter
        String letterToChange = String.valueOf(firstWord.charAt(index));

        //choose the option
        letterToChange = toUpperCase ? letterToChange.toUpperCase() : letterToChange.toLowerCase();

        //building the result
        StringBuilder newWord = new StringBuilder(firstWord);
        return newWord.replace(index, index + 1, letterToChange).toString();
    }

    public static String sortWordsInSentenceByLength(String sentence) {

        //array of words
        String[] words = sentence.split(SPLIT_WORDS);
        int length = words.length;

        //Lower Case of the first letter
        words[0] = changeTheCaseOfDefinedLetter(words[0], 0, false);

        //auxiliary array for sorting a sentence
        String[][] ascendingSequence = new String[length][2];
        for (int i = 0; i < length; i++) {
            ascendingSequence[i][0] = String.valueOf(words[i].length());
            ascendingSequence[i][1] = words[i];
        }

        //main logic
        sortStrings(ascendingSequence, 0, length - 1, true);

        //building the answer
        StringBuilder sortSentence = new StringBuilder(EMPTY_STRING);
        for (String[] word : ascendingSequence) {
            sortSentence.append(word[1]);
            sortSentence.append(SPACE_BAR);
        }

        //remove punctuation if appears in the end of the sentence
        int index = sortSentence.length() - 2;
        if (String.valueOf(sortSentence.charAt(index)).matches(PUNCTUATION)) {
            sortSentence.delete(index, index + 1);
        }

        //appending of last punctuation and making up the first letter
        sortSentence.replace(sortSentence.length() - 1, sortSentence.length() - 1, String.valueOf(sentence.charAt(sentence.length() - 1)));
        return changeTheCaseOfDefinedLetter(sortSentence.toString(), 0, true);
    }

    //sentences to Yoda stile)
    public static String sortWordsOfSentencesOfTheTextByLength(String text) {

        //divide text into paragraphs to ignore courage return
        String[] paragraphs = text.split(COURAGE_RETURN);

        //String for result
        StringBuilder result = new StringBuilder(EMPTY_STRING);

        //working builder
        StringBuilder sortedText = new StringBuilder();

        for (String paragraph : paragraphs) {

            //loading next sentence to the builder
            Matcher matcher = SENTENCE_PATTERN.matcher(paragraph);
            sortedText.replace(0, sortedText.length(), paragraph);

            //working with separate sentences
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String replace = sortWordsInSentenceByLength(matcher.group());
                sortedText.replace(start, end + 1, replace);
            }

            //forming paragraphs back
            result.append(sortedText).append(COURAGE_RETURN);
        }
        return result.toString();
    }

    //divide text into paragraphs and sort them by quantity of sentences
    public static String sortParagraphsByQuantityOfSentences(String text) {

        //divide text into paragraphs
        String[] paragraphs = text.split(COURAGE_RETURN);
        final int length = paragraphs.length;
        List<Paragraph> paragraphsList = new ArrayList<>();
        for (String s : paragraphs) {
            paragraphsList.add(new Paragraph(s));
        }
        Collections.sort(paragraphsList);

        //forming of the result
        StringBuilder sortedText = new StringBuilder();
        for (Paragraph p : paragraphsList) {
            sortedText.append(p.getContent());
            sortedText.append(COURAGE_RETURN);
        }
        return sortedText.toString();
    }

    //sorts array of strings with int parameter into right sequence
    //based on quick sort
    public static void sortStrings(String[][] strings, int fst, int lst, boolean isAscending) {
        if (fst >= lst) return;
        int mdl = Integer.parseInt(strings[(fst + lst) / 2][0]);
        int i = fst;
        int j = lst;
        while (i < j) {
            while (isAscending ? Integer.parseInt(strings[i][0]) < mdl : Integer.parseInt(strings[i][0]) > mdl) {
                i++;
            }
            while (isAscending ? Integer.parseInt(strings[j][0]) > mdl : Integer.parseInt(strings[j][0]) < mdl) {
                j--;
            }
            String[] tmp = strings[i];
            strings[i] = strings[j];
            strings[j] = tmp;
            if (i <= j) {
                i++;
                j--;
            }
        }
        sortStrings(strings, fst, j, isAscending);
        sortStrings(strings, i, lst, isAscending);
    }

    public static String sortLexemesOfSentence(String sentence, char character) {

        //array of words
        String[] words = sentence.split(SPLIT_WORDS);
        int length = words.length;

        //Lower Case of the first letter
        words[0] = changeTheCaseOfDefinedLetter(words[0], 0, false);

        //auxiliary array for sorting a sentence
        String[][] ascendingSequence = new String[length][2];
        for (int i = 0; i < length; i++) {
            ascendingSequence[i][0] = String.valueOf(WorkingWithStringsMethods.quantityOfSmthInTheString(String.valueOf(character), words[i]));
            ascendingSequence[i][1] = words[i];
        }

        //main logic
        sortStrings(ascendingSequence, 0, length - 1, false);

        //sort equals lexemes by alphabet
        //preparing variables
        String quantityOfOccurrences = ascendingSequence[0][0];
        int quantity = 0;
        int startIndex = 0;
        int len = ascendingSequence.length;
        int minusLen = len - 1;

        //walking trough words looking for the same quantity of occurrences
        for (int i = 0; i < len; i++) {
            if (i < minusLen && ascendingSequence[i][0].equals(quantityOfOccurrences)) {
                quantity++;
            } else {
                //sorting words with the same occurrences by alphabet
                if (i == minusLen) quantity++;
                if (quantity > 1) {
                    String[] auxArray = new String[quantity];
                    for (int j = 0; j < auxArray.length; j++) {
                        auxArray[j] = ascendingSequence[j + startIndex][1];
                    }
                    Arrays.sort(auxArray);
                    for (int j = 0; j < auxArray.length; j++) {
                        ascendingSequence[j + startIndex][1] = auxArray[j];
                    }
                }
                //reset variables
                quantity = 1;
                startIndex = i;
                quantityOfOccurrences = ascendingSequence[i][0];
            }
        }

        //building the answer
        StringBuilder sortSentence = new StringBuilder(EMPTY_STRING);
        for (String[] word : ascendingSequence) {
            sortSentence.append(word[1]);
            sortSentence.append(SPACE_BAR);
        }

        //remove punctuation if appears in the end of the sentence
        int index = sortSentence.length() - 2;
        if (String.valueOf(sortSentence.charAt(index)).matches(PUNCTUATION)) {
            sortSentence.delete(index, index + 1);
        }

        //appending of last punctuation and making up the first letter
        sortSentence.replace(sortSentence.length() - 1, sortSentence.length() - 1, String.valueOf(sentence.charAt(sentence.length() - 1)));
        return changeTheCaseOfDefinedLetter(sortSentence.toString(), 0, true);
    }

    public static String sortLexemesOfSentencesOfTheText(String text, char character) {

        //divide text into paragraphs to ignore courage return
        String[] paragraphs = text.split(COURAGE_RETURN);

        //String for result
        StringBuilder result = new StringBuilder(EMPTY_STRING);

        //working builder
        StringBuilder sortedText = new StringBuilder();

        for (String paragraph : paragraphs) {

            //loading next sentence to the builder
            Matcher matcher = SENTENCE_PATTERN.matcher(paragraph);
            sortedText.replace(0, sortedText.length(), paragraph);

            //working with separate sentences
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String replace = sortLexemesOfSentence(matcher.group(), character);
                sortedText.replace(start, end + 1, replace);
            }

            //forming paragraphs back
            result.append(sortedText).append(COURAGE_RETURN);
        }
        return result.toString();
    }

    public static boolean isDigit (String digit) {
        return digit.matches("\\d");
    }

    public static boolean isNumber (String number) {
        return number.matches("\\d+");
    }
}


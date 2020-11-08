package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ChoiceHandler {

    private final int OPTION;
    private final int OPTION_OF_TEXT_INPUT;
    private String textPath;
    private String text;
    private Scanner scanner = new Scanner(System.in);
    private String quantityOfParagraphs;
    private String PATH_TO_FILE = "[A-Z]:((\\\\)\\w+)+(\\\\)\\w+[.]txt";

    public ChoiceHandler(String option, String optionOfTextInput) {
        OPTION = Integer.parseInt(option);
        OPTION_OF_TEXT_INPUT = Integer.parseInt(optionOfTextInput);
    }

    public void handleChoices() throws IOException {
        switch (OPTION_OF_TEXT_INPUT) {
            case 1 : {
                System.out.println("Enter quantity of paragraphs:");
                quantityOfParagraphs = scanner.next();
                text = StringAuxiliaryMethods.EMPTY_STRING;
                String paragraph;
                while (!StringAuxiliaryMethods.isNumber(quantityOfParagraphs)) {
                    System.out.println("Wrong input. Try again.");
                    quantityOfParagraphs = scanner.nextLine();
                }
                int k = Integer.parseInt(quantityOfParagraphs);
                scanner = new Scanner(System.in);
                for (int i = 0; i < k; i++) {
                    System.out.println("Enter next paragraph:");
                    paragraph = scanner.nextLine();
                    text = text.concat(paragraph).concat(StringAuxiliaryMethods.COURAGE_RETURN);
                }
                System.out.print("Text complete.\n\n");
                System.out.println(text);
                break;
            }
            case 2 : {
                System.out.println("Enter path to file kind of \"D:\\folder\\file.txt\"");
                textPath = scanner.nextLine();
                while (!textPath.matches(PATH_TO_FILE) || !Files.exists(Path.of(textPath))) {
                    System.out.println("Wrong input or such file isn't exists. Try again.");
                    textPath = scanner.nextLine();
                }
                text = WorkingFileMethods.readUsingFiles(textPath);
                System.out.println("File loaded:");
                System.out.println(text);
                break;
            }
            case 3 : {
                System.out.println("There is such text:");
                text = "Someone has to protect this family from the man who protects this family.\r\nYou either run from things or you face them.\r\n" +
                        "No offence, but I don’t take bribes from strangers, you know? Better safe than sorry. That’s my motto.\r\nAll right. Money up front. Sometimes you got to rob to keep your riches.";
                System.out.println(text);
                break;
            }
        }
        switch (OPTION) {
            case 1 : {
                System.out.print("\nhandling...\n\n");
                text = StringAuxiliaryMethods.sortParagraphsByQuantityOfSentences(text);
                System.out.println(text);
                break;
            }
            case 2 : {
                System.out.print("\nhandling...\n\n");
                text = StringAuxiliaryMethods.sortWordsOfSentencesOfTheTextByLength(text);
                System.out.println(text);
                break;
            }
            case 3 : {
                System.out.println("Enter the character: (only first symbol will be read)");
                char ch = scanner.next().charAt(0);
                System.out.print("\nhandling...\n\n");
                text = StringAuxiliaryMethods.sortLexemesOfSentencesOfTheText(text, ch);
                System.out.println(text);
                break;
            }
        }
        if (OPTION_OF_TEXT_INPUT == 2) {
            System.out.println("Overwrite the file by handled text? (enter 1 for \"yes\".)");
            quantityOfParagraphs = scanner.nextLine();
            if (StringAuxiliaryMethods.isDigit(quantityOfParagraphs) && Integer.parseInt(quantityOfParagraphs) == 1) {
                WorkingFileMethods.recordFile(textPath, text);
            }
        }
    }
}

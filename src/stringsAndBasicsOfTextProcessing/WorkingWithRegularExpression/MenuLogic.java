package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

import java.util.Scanner;

public class MenuLogic {

    private String option;
    private String optionOfInputText;

    public MenuOptions start() {

        //start menu
        System.out.println("Hello, choose an option by entering one of the following number:");
        System.out.println();
        System.out.println("1. To sort paragraphs of text by the quantity of sentences.");
        System.out.println("2. To sort words in sentences by length.");
        System.out.println("3. To sort lexemes in sentences either descending occurrences of defined character or by alphabet.");
        Scanner scanner = new Scanner(System.in);
        option = scanner.next();

        //check input
        inputCheck(option, scanner);

        //manual text input or choosing of existing .txt file
        System.out.println("Choose following:");
        System.out.println("1. Manual text input.");
        System.out.println("2. Choose existing .txt file.");
        System.out.println("3. Test.");

        optionOfInputText = scanner.next();
        //check input
        inputCheck(optionOfInputText, scanner);

        return new MenuOptions(Integer.parseInt(option), Integer.parseInt(optionOfInputText));
    }

    void inputCheck (String option, Scanner scanner) {
        boolean firstCondition = firstCondition(option);
        boolean secondCondition = secondCondition(option);
        while (firstCondition || secondCondition) {
            System.out.println("Wrong input. Try again.");
            option = scanner.next();
            firstCondition = firstCondition(option);
            secondCondition = secondCondition(option);
        }
    }

    boolean firstCondition (String option) {
        return !StringAuxiliaryMethods.isDigit(option);
    }

    boolean secondCondition (String option) {
        return (StringAuxiliaryMethods.isDigit(option) && (Integer.parseInt(option) < 1 || Integer.parseInt(option) > 3));
    }
}



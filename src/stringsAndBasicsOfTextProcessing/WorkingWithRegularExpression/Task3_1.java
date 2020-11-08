package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*Cоздать приложение, разбирающее текст (текст хранится в строке)
и позволяющее выполнять с текстом три различных операции:
отсортировать абзацы по количеству предложений;
в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию
количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */
public class Task3_1 {
    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        menu.start();
        ChoiceHandler handler = new ChoiceHandler(menu.getOption(),menu.getOptionOfInputText());
        handler.handleChoices();
    }
}

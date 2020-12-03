package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

import java.io.IOException;

/*Cоздать приложение, разбирающее текст (текст хранится в строке)
и позволяющее выполнять с текстом три различных операции:
отсортировать абзацы по количеству предложений;
в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию
количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MenuLogic menu = new MenuLogic();
        MenuOptions choices = menu.start();
        ChoiceHandler handler = new ChoiceHandler(choices.getOperationChoice(), choices.getInputChoice());
        handler.handleChoices();
    }
}

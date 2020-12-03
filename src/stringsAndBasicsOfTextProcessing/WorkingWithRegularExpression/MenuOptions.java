package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

public class MenuOptions {
    private int operationChoice;
    private int inputChoice;

    public MenuOptions(int operationChoice, int inputChoice) {
        this.operationChoice = operationChoice;
        this.inputChoice = inputChoice;
    }

    public int getInputChoice() {
        return inputChoice;
    }

    public void setInputChoice(int inputChoice) {
        this.inputChoice = inputChoice;
    }

    public int getOperationChoice() {
        return operationChoice;
    }

    public void setOperationChoice(int operationChoice) {
        this.operationChoice = operationChoice;
    }


}

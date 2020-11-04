package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/* Строка X состоит из нескольких предложений,
каждое из которых кончается точкой, восклицательным
или вопросительным знаком. Определить количество предложений в строке X.
 */
public class Task2_10 {
    public static void main(String[] args) {

        String sentences = "One.Second!Third?Fourth.Fifth.Six?Sevens!";

        int numberOfSentences = WorkingWithStringsMethods.quantityOfSmthInTheString("\\w+[.!?]",sentences);
        System.out.println(numberOfSentences);                            //7

        //another option
        System.out.println(sentences.split("[^.!?]+").length-1);   //7
    }
}

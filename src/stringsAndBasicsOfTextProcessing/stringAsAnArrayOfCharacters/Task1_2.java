package stringsAndBasicsOfTextProcessing.stringAsAnArrayOfCharacters;

/*Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task1_2 {
    public static void main(String[] args) {
        String words = "Word word Word word";
        words = words.replaceAll("[Ww]ord","letter");
        System.out.println(words);
    }
}

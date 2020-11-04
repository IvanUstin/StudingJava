package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/*Вводится строка. Требуется удалить из нее
повторяющиеся символы и все пробелы. Например,
если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class Task2_7 {
    public static void main(String[] args) {

        String string = "abc cde def";
        System.out.println(WorkingWithStringsMethods.deleteRepeatedSymbolsAndSpaces(string));
    }
}

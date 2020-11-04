package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/*Посчитать количество строчных (маленьких) и прописных
(больших) букв в введенной строке. Учитывать только английские буквы.
 */
public class Task2_9 {
    public static void main(String[] args) {

        String string = "abcgABCGA";
        System.out.println(WorkingWithStringsMethods.quantityOfSmthInTheString("[a-z]",string));
        System.out.println(WorkingWithStringsMethods.quantityOfSmthInTheString("[A-Z]",string));
    }
}

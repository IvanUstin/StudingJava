package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/*Подсчитать, сколько раз среди символов
 заданной строки встречается буква “а”.
 */
public class Task2_5 {
    public static void main(String[] args) {
        String string = "a aa aaa";
        System.out.println(WorkingWithStringsMethods.quantityOfSmthInTheString("a",string));   //6
    }
}

package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

import java.util.Set;

/*Дан текст (строка). Найдите наибольшее
количество подряд идущих пробелов в нем.
 */
public class Task2_1 {
    public static void main(String[] args) {

        String anotherString = "hello mr  Jane,    Jane  how are      you      ?";

        //indexes
        Set<Integer> setOfIndexes = WorkingWithStringsMethods.indexOfTheLargestMatch(" +",anotherString);
        System.out.println(setOfIndexes);

        //quantity
        System.out.println(WorkingWithStringsMethods.lengthOfTheLargestMatch(" +",anotherString));
    }
}

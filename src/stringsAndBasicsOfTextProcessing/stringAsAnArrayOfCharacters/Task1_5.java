package stringsAndBasicsOfTextProcessing.stringAsAnArrayOfCharacters;

import javax.management.monitor.StringMonitor;

/*Удалить в строке все лишние пробелы,
то есть серии подряд идущих пробелов заменить
на одиночные пробелы. Крайние пробелы в строке удалить.
 */
public class Task1_5 {
    public static void main(String[] args) {
        System.out.println(StringsMethods.deleteExtraSpaces("   privet     cho  delaish?  "));
    }
}

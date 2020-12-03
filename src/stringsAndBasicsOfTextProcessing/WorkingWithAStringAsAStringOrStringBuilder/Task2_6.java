package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/*Из заданной строки получить новую,
повторив каждый символ дважды.
 */
public class Task2_6 {
    public static void main(String[] args) {

        String oneSymbolString = "123 abc";
        String doubleSymbolString = WorkingWithStringsMethods.repeatEverySymbolOfTheString(oneSymbolString,2);
        System.out.println(doubleSymbolString); //112233  aabbcc
    }
}


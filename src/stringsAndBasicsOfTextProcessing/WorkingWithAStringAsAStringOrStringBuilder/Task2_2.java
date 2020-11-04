package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/*В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2_2 {
    public static void main(String[] args) {
        String string = "a aa aaa";
        string = string.replaceAll("a","ab");
        System.out.println(string);
    }
}

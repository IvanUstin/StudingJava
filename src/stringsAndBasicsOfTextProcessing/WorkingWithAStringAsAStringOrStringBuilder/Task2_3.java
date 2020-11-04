package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/*Проверить, является ли заданное слово палиндромом.
 */
public class Task2_3 {
    public static void main(String[] args) {
        System.out.println(WorkingWithStringsMethods.isPalindrome("tenet"));               // true
        System.out.println(WorkingWithStringsMethods.isPalindrome("шалаш"));               // true
        System.out.println(WorkingWithStringsMethods.isPalindrome("notThePalindrome"));    // false
    }
}

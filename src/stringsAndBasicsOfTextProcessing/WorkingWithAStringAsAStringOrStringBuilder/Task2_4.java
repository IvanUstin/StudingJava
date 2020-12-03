package stringsAndBasicsOfTextProcessing.WorkingWithAStringAsAStringOrStringBuilder;

/*С помощью функции копирования и операции конкатенации
 составить из частей слова “информатика” слово “торт”.
 */
public class Task2_4 {
    public static void main(String[] args) {

        //naturally i didn't understand anything
        String informationSubject = "Информатика";
        String cake = informationSubject.substring(7,8);        //т
        cake = cake.concat(informationSubject.substring(3,5));  //тор
        cake = cake.concat(informationSubject.substring(7,8));  //торт
        System.out.println(cake);
    }
}

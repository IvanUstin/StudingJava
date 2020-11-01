package stringsAndBasicsOfTextProcessing.stringAsAnArrayOfCharacters;

/*Дан массив названий переменных в camelCase.
 Преобразовать названия в snake_case.
 */
public class Task1_1 {
    public static void main(String[] args) {
        String[] variables = {"mamaIsTheBest","badIsTheWorst","someVariable","otherSomeVariable"};
        variables = StringsMethods.arrayOfWordsTo_snake_case(variables);
        for (String variable :
                variables) {
            System.out.println(variable);
        }
    }
}

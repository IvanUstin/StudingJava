package algoritmization.decompositionUsingMethods;

/*Из заданного числа вычли сумму его цифр.
Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести,
чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */
public class Task4_17 {
    public static void main(String[] args) {
        final int number = 15;
        System.out.printf("The quantity of iterations for the number %d is %d",
                number,DecompositionMethods.quantityOfIterations(number));
    }
}

package algoritmization.decompositionUsingMethods;

/*Задан массив D. Определить следующие суммы:
 D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 Пояснение. Составить метод(методы) для вычисления суммы
 трех последовательно расположенных элементов массива с номерами от k до m.
 */
public class Task4_8 {
    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5,6};
        int sumOfTree = DecompositionMethods.sumOfSuccessiveElements(array,2,5);
        System.out.println(sumOfTree);
    }
}

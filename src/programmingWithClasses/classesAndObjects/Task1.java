package programmingWithClasses.classesAndObjects;
/*Создайте класс Test1 с двумя переменными. Добавьте метод
вывода на экран и методы изменения этих переменных. Добавьте метод,
который находит сумму значений этих переменных, и метод,
который находит наибольшее значение из этих двух переменных.
 */
import static programmingWithClasses.classesAndObjects.Test1.*;
public class Task1 {
    public static void main(String[] args) {
        //методы изменения этих переменных
        setX(5);
        setY(7);
        //метод вывода на экран
        showX();
        showY();
        //метод который находит сумму значений переменных
        System.out.println(sum());
        //метод кторый находит наибольшее значение
        System.out.println(max());
    }
}

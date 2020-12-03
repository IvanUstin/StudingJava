package programmingWithClasses.classesAndObjects;
/*Создйте класс Test2 двумя переменными.
Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Task2 {
    public static void main(String[] args) {
        Test2 test = new Test2(2,3);
        test.setX(3);
        test.setY(2);
        System.out.println(test.getX() + " " + test.getY());
        Test2 test2 = new Test2();
        System.out.println(test2.getX() + " " + test2.getY());
    }
}

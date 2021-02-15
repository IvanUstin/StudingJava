package programmingWithClasses.classesAndObjects.task5;
/*Опишите класс, реализующий десятичный счетчик,
который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию
счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния,
и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */
public class Task5 {
    public static void main(String[] args) {
        //dec counter
        //default value 0
        Counter counter = new Counter(0,1,1,0,10);

        //increment in range
        counter.show();
        counter.increase();  //1
        counter.increase();  //2
        counter.increase();  //3
        counter.increase();  //4
        counter.increase();  //5
        counter.increase();  //6
        counter.setInc(2);
        counter.increase();  //8
        counter.increase();  //10
        counter.increase();  //10!

        //decrement in range
        counter.decrease();  //9
        counter.decrease();  //8
        counter.setDec(2);
        counter.decrease();  //6
        counter.decrease();  //4
        counter.decrease();  //2
        counter.decrease();  //0
        counter.decrease();  //0!

        //initialisation by random value
        Counter randomDefault = new Counter(5,5,0,100);
        randomDefault.show();
    }
}

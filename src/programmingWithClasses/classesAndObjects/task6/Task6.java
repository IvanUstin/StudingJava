package programmingWithClasses.classesAndObjects.task6;

/*Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей
(час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

/**
 *  в данном классе приводится демонстрация основных методов класса Time
  */
public class Task6 {
    public static void main(String[] args) {
        //set time
        //check input values
        //in case of invalid values set 0
        Time time = new Time(25,61,61);
        System.out.println(time);

        //changing time by hours, minutes, seconds methods
        //hours
        time.plusHours(20);
        System.out.println(time); //20:00:00
        time.plusHours(36);
        System.out.println(time); //08:00:00
        time.minusHours(6);
        System.out.println(time); //02:00:00
        time.minusHours(36);
        System.out.println(time); //14:00:00
        System.out.println();

        //minutes
        time.plusMinutes(45);
        System.out.println(time); //14:45:00
        time.plusMinutes(30);
        System.out.println(time); //15:15:00
        time.minusMinutes(5);
        System.out.println(time); //15:10:00
        time.minusMinutes(25);
        System.out.println(time); //14:45:00
        System.out.println();

        //seconds
        time.plusSeconds(45);
        System.out.println(time); //14:45:45
        time.plusSeconds(30);
        System.out.println(time); //14:46:15
        time.minusSeconds(5);
        System.out.println(time); //14:46:10
        time.minusSeconds(25);
        System.out.println(time); //14:45:45
        System.out.println();
    }
}

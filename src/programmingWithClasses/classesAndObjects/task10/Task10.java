package programmingWithClasses.classesAndObjects.task10;

import programmingWithClasses.classesAndObjects.task4.DepartureTime;

/**
 * Создать класс Airline, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().
 * Создать второй класс, агрегирующий массив типа Airline,
 * с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *
 * Найти и вывести:
 *
 * a) список рейсов для заданного пункта назначения;
 *
 * b) список рейсов для заданного дня недели;
 *
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Task10 {
    public static void main(String[] args) {

        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addFlight(new AirLine("Minsk",1,"budget", DepartureTime.AT_7_00,DayOfWeek.SATURDAY));
        flightSchedule.addFlight(new AirLine("Minsk",2,"budget", DepartureTime.AT_7_00,DayOfWeek.THURSDAY));
        flightSchedule.addFlight(new AirLine("Paris",3,"budget", DepartureTime.AT_8_00,DayOfWeek.THURSDAY));
        flightSchedule.addFlight(new AirLine("London",4,"budget", DepartureTime.AT_7_00,DayOfWeek.MONDAY));

        flightSchedule.sortByDay();
        System.out.println();
        flightSchedule.toDestination("Minsk");
        System.out.println();
        flightSchedule.onDay(DayOfWeek.THURSDAY);
        System.out.println();
        flightSchedule.after(DayOfWeek.THURSDAY,DepartureTime.AT_7_00);
    }
}

package programmingWithClasses.classesAndObjects.task4;
/* Создайте класс Train, содержащий поля: название пункта назначения,
номер поезда, время отправления. Создайте данные в массив из пяти элементов типа Train,
добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */
public class Task4 {
    public static void main(String[] args) {

        //Расписание
        TrainSchedule schedule = new TrainSchedule();
        schedule.addRide("Moscow",324,DepartureTime.AT_6_00);
        schedule.addRide("Moscow",532,DepartureTime.AT_3_00);
        schedule.addRide("London",173,DepartureTime.AT_22_00);
        schedule.addRide("Minsk",233,DepartureTime.AT_7_00);
        schedule.addRide("Kiev",954,DepartureTime.AT_14_00);

        //schedule sorting by number of train
        schedule.numberSort();
        System.out.println();

        //schedule sorting by departure time
        schedule.departureSort();
        System.out.println();

        //schedule sorting by destination, and if there are trains with the same destination,
        // it sorts by departure time
        schedule.destinationSort();
        System.out.println();

        //ride information output
        schedule.rideInfo(233);
        schedule.rideInfo(333); // There is no such train!
    }
}

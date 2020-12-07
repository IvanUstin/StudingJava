package programmingWithClasses.classesAndObjects.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainSchedule {
    private List<Train> schedule = new ArrayList<>();

    public void addRide (String destination, int number, DepartureTime departureTime) {
        schedule.add(new Train(destination, number, departureTime));
    }

    public void show () {
        for (Train t : schedule) {
            System.out.println(t);
        }
    }

    public void departureSort() {
        Train.sortByDeparture();
        Collections.sort(schedule);
        show();
    }

    public void destinationSort() {
        Train.sortByDestination();
        Collections.sort(schedule);
        show();
    }

    public void numberSort() {
        Train.sortByNumber();
        Collections.sort(schedule);
        show();
    }

    public void rideInfo(int number) {
        StringBuilder info = new StringBuilder();
        for (Train t : schedule) {
            if (t.getNumber() == number) {
                info.append(t.toString()).append("\n");
            }
        }
        if (info.toString().equals("")) {
            System.out.println("There is no such train!");
        } else {
            System.out.println(info);
        }
    }
}

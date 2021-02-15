package programmingWithClasses.classesAndObjects.task10;

import programmingWithClasses.classesAndObjects.task4.DepartureTime;

import java.util.*;

public class FlightSchedule {
    List<AirLine> flights = new ArrayList<>();

    public FlightSchedule() {
    }

    public void addFlight(AirLine flight) {
        flights.add(flight);
    }

    public void sortByDay() {
        List<AirLine> sortFlights = new ArrayList<>(List.copyOf(flights));
        sortFlights.sort(new SameDay());
        for (AirLine a :
                flights) {
            System.out.println(a);
        }
    }

    public void toDestination(String destination) {
        for (AirLine a :
                flights) {
            if (a.getDestination().equals(destination)) {
                System.out.println(a);
            }
        }
    }

    public void onDay(DayOfWeek day) {
        for (AirLine a :
                flights) {
            if (a.getDay().equals(day)) {
                System.out.println(a);
            }
        }
    }

    public void after(DayOfWeek day, DepartureTime time) {
        for (AirLine a :
                flights) {
            if (a.getDay().compareTo(day) > 0) {
                break;
            }
            if (a.getDay().equals(day)&&a.getTime().compareTo(time)>0) {
                System.out.println(a);
            }
        }
    }

    class SameDay implements Comparator<AirLine> {
        @Override
        public int compare(AirLine airLine, AirLine t1) {
            return airLine.getDay().compareTo(t1.getDay());
        }
    }

}

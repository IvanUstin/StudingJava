package programmingWithClasses.classesAndObjects.task10;

import programmingWithClasses.classesAndObjects.task4.DepartureTime;

public class AirLine implements Comparable<AirLine>{
    private String destination;
    private int flightNumber;
    private String type;
    private DepartureTime time;
    private DayOfWeek day;

    public AirLine(String destination, int flightNumber, String type, DepartureTime time, DayOfWeek day) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.type = type;
        this.time = time;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DepartureTime getTime() {
        return time;
    }

    public void setTime(DepartureTime time) {
        this.time = time;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(AirLine airLine) {
        return this.day.compareTo(airLine.day);
    }
}

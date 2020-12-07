package programmingWithClasses.classesAndObjects.task4;

public class Train implements Comparable<Train>{

    private static int sortBy = 1;
    private String destination;
    private int number;
    private DepartureTime departureTime;

    public Train(String destination, int number, DepartureTime departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return String.format("ride #%d, destination: %s,\t departure time %s.",number, destination, departureTime);
    }

    public static void sortByDeparture () {
        sortBy = 1;
    }

    public static void sortByNumber () {
        sortBy = 2;
    }

    public static void sortByDestination () {
        sortBy = 3;
    }

    @Override
    public int compareTo(Train train) {
        switch (sortBy) {
            case 2 :
                return Integer.compare(this.number, train.number);
            case 3 :
                return this.destination.concat(this.departureTime.toString()).compareTo(train.destination.concat(train.departureTime.toString()));
            default :
                return this.departureTime.toString().compareTo(train.getDepartureTime().toString());
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this.hashCode() != obj.hashCode()) return false;
        Train train = (Train) obj;
        return number == train.number &&
                destination.equals(train.destination) &&
                departureTime == train.departureTime;
    }
}

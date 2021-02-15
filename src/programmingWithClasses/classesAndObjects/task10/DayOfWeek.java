package programmingWithClasses.classesAndObjects.task10;

public enum DayOfWeek {
    MONDAY("MONDAY", 1),TUESDAY("TUESDAY",2),WEDNESDAY("WEDNESDAY",3),
    THURSDAY("THURSDAY",4),FRIDAY("THURSDAY",5),SATURDAY("SATURDAY",6),SUNDAY("SUNDAY",7);

    String name;
    int sequence;

    DayOfWeek(String name, int sequence) {
        this.name = name;
        this.sequence = sequence;
    }

    public String toString() {
        return name;
    }

}
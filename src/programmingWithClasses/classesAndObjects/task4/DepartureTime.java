package programmingWithClasses.classesAndObjects.task4;

public enum DepartureTime {
    AT_0_00("00:00"), AT_1_00("01:00"), AT_2_00("02:00"), AT_3_00("03:00"), AT_4_00("04:00"), AT_5_00("05:00"),
    AT_6_00("06:00"), AT_7_00("07:00"), AT_8_00("08:00"), AT_9_00("09:00"), AT_10_00("10:00"), AT_11_00("11:00"),
    AT_12_00("12:00"), AT_13_00("13:00"), AT_14_00("14:00"), AT_15_00("15:00"), AT_16_00("16:00"), AT_17_00("17:00"),
    AT_18_00("18:00"), AT_19_00("19:00"), AT_20_00("20:00"), AT_21_00("21:00"), AT_22_00("22:00"), AT_23_00("23:00");

    String time;

    DepartureTime(String time) {
        this.time = time;
    }

    public String toString() {
        return time;
    }
}

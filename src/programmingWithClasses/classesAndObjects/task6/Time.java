package programmingWithClasses.classesAndObjects.task6;

/**
 * This class implements the mechanics of an electronic dial for displaying time in this format
 * @author IvanUstin
 * @version 1.2
 * @since version 1.1
 * @see programmingWithClasses.classesAndObjects.task6.Task6
 */
public class Time {


    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Time is usual object constructor of class "Time"
     * @param hours describes count of hours of current time
     * @param minutes describes count of minutes of current time
     * @param seconds describes count of seconds of current time
     */
    public Time (int hours, int minutes, int seconds) {
        if (hours > 24) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
        if (minutes > 60) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
        if (seconds > 60) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    /**
     * This method adds hours to the count
     * @param hours means number of addition hours
     */
    public void plusHours(int hours) {
        if (this.hours + hours <= 24) {
            this.hours += hours;
        } else {
            this.hours = (this.hours + hours) % 24;
        }
    }

    public void minusHours(int hours) {
        if (this.hours - hours >= 0) {
            this.hours -= hours;
        } else {
            this.hours = 24 - (hours - this.hours) % 24;
        }
    }

    public void plusMinutes(int minutes) {
        int sum = this.minutes + minutes;
        if (sum <= 60) {
            this.minutes = sum;
        } else {
            plusHours(sum / 60);
            this.minutes = sum % 60;
        }
    }

    public void minusMinutes(int minutes) {
        int sub = this.minutes - minutes;
        if (sub >= 0) {
            this.minutes = sub;
        } else {
            int div = (minutes - this.minutes) / 60;
            minusHours(div == 0 ? 1 : div);
            this.minutes = 60 - (minutes - this.minutes) % 60;
        }
    }

    public void plusSeconds(int seconds) {
        int sum = this.seconds + seconds;
        if (sum <= 60) {
            this.seconds = sum;
        } else {
            plusMinutes(sum / 60);
            this.seconds = (sum) % 60;
        }
    }

    public void minusSeconds(int seconds) {
        int sub = this.seconds - seconds;
        if (sub >= 0) {
            this.seconds = sub;
        } else {
            int div = (seconds - this.seconds) / 60;
            minusMinutes(div == 0 ? 1 : div);
            this.seconds = 60 - (seconds - this.seconds) % 60;
        }
    }

    public void setHours(int hours) {
        if (hours > 24) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes > 60) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds > 60) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }
    public String toString() {
        return String.format((hours > 9 ? "%d" : "0%d") + ":" +  (minutes > 9 ? "%d" : "0%d") + ":" + (seconds > 9 ? "%d" : "0%d"),hours, minutes, seconds);
    }
}

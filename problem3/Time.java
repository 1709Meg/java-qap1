package problem3;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String formattedHour;
        String formattedMinute;
        String formattedSecond;

        if (hour < 10) {
            formattedHour = "0" + hour;
        } else {
            formattedHour = "" + hour;
        }

        if (minute < 10) {
            formattedMinute = "0" + minute;
        } else {
            formattedMinute = "" + minute;
        }

        if (second < 10) {
            formattedSecond = "0" + second;
        } else {
            formattedSecond = "" + second;
        }

        return formattedHour + ":" + formattedMinute + ":" + formattedSecond;
    }

    public Time nextSecond() {
        second += 1;
        return this;
    }

    public Time previousSecond() {
        second -= 1;
        return this;
    }

}

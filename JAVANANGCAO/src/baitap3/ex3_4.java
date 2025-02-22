package baitap3;

public class ex3_4 {
    private int hour;
    private int minute;
    private int second;

    public ex3_4() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public ex3_4(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) this.hour = hour;
        if (minute >= 0 && minute < 60) this.minute = minute;
        if (second >= 0 && second < 60) this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) this.minute = minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public ex3_4 nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public ex3_4 nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public ex3_4 nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    public ex3_4 previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public ex3_4 previousMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public ex3_4 previousHour() {
        hour = (hour - 1 + 24) % 24;
        return this;
    }

    public static void main(String[] args) {
        ex3_4 time = new ex3_4(23, 59, 59);
        System.out.println("Current Time: " + time);

        time.nextSecond();
        System.out.println("After nextSecond(): " + time);

        time.previousSecond();
        System.out.println("After previousSecond(): " + time);

        time.nextMinute();
        System.out.println("After nextMinute(): " + time);

        time.previousMinute();
        System.out.println("After previousMinute(): " + time);

        time.nextHour();
        System.out.println("After nextHour(): " + time);

        time.previousHour();
        System.out.println("After previousHour(): " + time);
    }
}

package util;

import java.util.*;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate() {
        GregorianCalendar date = new GregorianCalendar();

        setYear(date.get(Calendar.YEAR));
        setMonth(date.get(Calendar.MONTH));
        setDay(date.get(Calendar.DAY_OF_MONTH));
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);

        setYear(date.get(Calendar.YEAR));
        setMonth(date.get(Calendar.MONTH));
        setDay(date.get(Calendar.DAY_OF_MONTH));
    }

    public MyDate(int year, int month, int day) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

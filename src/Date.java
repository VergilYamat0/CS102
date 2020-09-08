/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class Date {

    private int day;
    private int month;
    private int year;

    private static final int[] dayPerMonth
            = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int d, int m, int y) {
        setYear(y);
        setMonth(m);
        setDay(d);
    }

    public void setYear(int year) {
        if ((year > 1950) && (year < 2100)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("year must be 1950-2100");
        }
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        if ((month > 0) && (month <= 12)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("month must be 1-12");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if ((day > 0) && (day <= dayPerMonth[month])) {
            this.day = day;
        } //for leap year
        else if ((month == 2) && (day == 29) && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("day is out of range");
        }
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return String.format("%02d/%02d/%d", getDay(), month, year);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class Time implements Comparable<Time> {

    private int hour; // 24
    private int minute; // 60 
    private int second; // 60 

    public Time(int hour, int minute, int second) { // this is the default method where the call of three parameter should go to
        /*this.hour = hour;
        this.minute = minute;
        this.second = second;*/

        setHour(hour); // this is better than the one above!
        setMinute(minute);
        setSecond(second);
    }

    public int compareTo(Time t) {
        if (this.getHour() > t.getHour()) {
            return 1;
        } else if (this.getHour() < t.getHour()) {
            return -1;
        } else if (this.getMinute() > t.getMinute()) {
            return 1;
        } else if (this.getMinute() < t.getMinute()) {
            return -1;
        } else if (this.getSecond() > t.getSecond()) {
            return 1;
        } else if (this.getSecond() < t.getSecond()) {
            return -1;
        } else {
            return 0;
        }

    }

    // method overloading! 
    public Time() { // this is the method where no parameters were called in it!
        /*setHour(0); 
        setMinute(0);
        setSecond(0);*/

        this(0, 0, 0); // this is to call a consturctor with 3 aguments. Instead of doing the one above!  
    }

    public Time(int hour) { // this is a method where the hour is being called!
        // setHour(hour);
        this(hour, 0, 0); // if the user wanted to enter only the hour he would go to this method! ** method overloading ** 
    }

    public Time(int hour, int minute) { // this is a method where the hour & minute are being called! 
        // setHour(hour);
        // setMinute(minute);

        this(hour, minute, 0); // the word this is to call the orignal constructr! 
    }

    // copy constructer
    public Time(Time t) { // i didn't understand this!
        this(t.hour, t.minute, t.second);

    }

    public void setHour(int hour) {
        if ((hour >= 0) && (hour < 24)) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour is not correct. ");

        }
    }

    public void setMinute(int minute) {
        if ((minute >= 0) && (minute < 60)) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute is not correct. ");

        }
    }

    public void setSecond(int second) {
        if ((second >= 0) && (second < 60)) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second is not correct. ");

        }
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

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second); // the same as printf! 
    }

}

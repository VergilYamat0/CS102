/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeQuizSpring2015;

/**
 *
 * @author 3z
 */
public class Temperature {

    private char unit;
    private double value;
    private Date date;

    public Temperature(char unit, double value, Date date) {
        setUnit(unit);
        setValue(value);
        setDate(date);
    }

    public void setUnit(char unit) { // we have to use data validation here for the units
        if ((unit == 'C') || (unit == 'F') || (unit == 'c') || (unit == 'f')) {
            this.unit = unit;
        } else {
            throw new IllegalArgumentException("Wrong Unit");
        }
    }

    public void setValue(double value) {
        this.value = value; // no data validation here           
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public char getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public Temperature convertToCelsius(){
        if((unit == 'F') || (unit == 'f')){
            value = (value - 32)/1.8;
            this.unit = 'C';
        }
        else{
            System.out.println("Same unit, no conversion. ");
            
        }
        return this; // returning Temprature
    }

     public Temperature convertToFahrenheit(){
        if((unit == 'C') || (unit == 'c')){
            value = (value * 1.8 ) + 32;            
            this.unit = 'F';
        }
        else{
            System.out.println("Same unit, no conversion. ");
            
        }
        return this; // returning Temprature
     }
     public String toString(){
         return String.format("%.2f  %c \n", value, unit);
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author 3z
 */
public class PressureImpl implements Pressure {

    private char unit;
    private double value;

    public PressureImpl(char unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public char getUnit() {
        return unit;
    }

    @Override
    public void setUnit(Character unit) {
        this.unit = unit;
    }

}

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
public class DistanceImpl implements Distance {

    private char unit;
    private double value;

    public DistanceImpl(char unit, double value) {
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

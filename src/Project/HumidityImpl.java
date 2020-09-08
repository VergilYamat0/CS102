package Project;

public class HumidityImpl implements Humidity {

    private char unit;
    private double value;

    public HumidityImpl(char unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(Character unit) {
        this.unit = unit;
    }

}

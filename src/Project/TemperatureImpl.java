package Project;

public class TemperatureImpl implements Temperature {

    private double value;
    private char unit;

    public TemperatureImpl(double value, Character unit) {
        setValue(value);
        setUnit(unit);
    }

    public void setUnit(Character unit) {
       this.unit = unit;

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

}

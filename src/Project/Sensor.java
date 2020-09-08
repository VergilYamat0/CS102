package Project;

public interface Sensor {

    public abstract double getValue();

    public abstract void setValue(double value);

    public abstract char getUnit();

    public abstract void setUnit(Character unit);

}

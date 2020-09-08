package Project;

import PracticeQuizSpring2015.Date;
import Quiz2_2016.City;

public interface DataAnalytics {

    public abstract double hottestTemperature(Date d1, Date d2); 

    public abstract double averageMeasurements(City city, Date d1, Date d2);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import PracticeQuizSpring2015.Date;
import Quiz2_2016.City;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author 3z
 */
public class TestClass implements DataAnalytics {

    @Override
    public double hottestTemperature(Date d1, Date d2) {
     
       
    }

    @Override
    public double averageMeasurements(City city, Date d1, Date d2) {
        double sum = 0.0;
        File read = new File("Data.txt");
        try {
            Scanner s = new Scanner(read);
            while (s.hasNextLine()) {
                
            }
        } catch (FileNotFoundException ex) {
            throw new IllegalArgumentException("Error");
        }
    }
    
}

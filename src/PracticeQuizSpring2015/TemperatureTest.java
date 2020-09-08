/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeQuizSpring2015;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 3z
 */
public class TemperatureTest {

    public static void main(String[] args) throws IOException {
        ArrayList<Temperature> tmps = new ArrayList<Temperature>();
        
        Temperature t1 = new Temperature('C', 14.5, new Date(2,3,2018));
        tmps.add(t1); // adding the temeprature data to the arraylist to save it there 
        
        Temperature t2 = new Temperature('F', 80.5, new Date(3,1,2017));
        tmps.add(t2); 
        
        Temperature t3 = new Temperature('C', 35.2, new Date(2,3,2018));
        
       
        tmps.add(t3);
        
        
        System.out.println(tmps.get(2) + " before change^^");
        System.out.println("After setting the new tempertare: ");
        tmps.get(2).setValue(90.3); // to change the value of certain temperature object which is t2 
        tmps.get(2).setUnit('F');
        tmps.get(2).getDate().setDay(5);
        System.out.println(tmps.get(2));
        
        
        System.out.println("");
        tmps.get(2).convertToCelsius(); // 2 == t3
        System.out.println("after conversion:" );
        System.out.println("");
        System.out.println(tmps.get(2));
       
        System.out.println(" ----------------------------");
        
        
        File file = new File("tmp.txt");
        FileWriter fw = new FileWriter(file);
        for(int i =0; i < tmps.size(); i++){
            fw.write(tmps.get(i).toString());
        }
        fw.close();
        
        /*System.out.print("T1: " + t1);
        System.out.print("T2: " + t2);
        System.out.print("T3: " + t3);*/
        
          
        for(int i =0; i < tmps.size(); i++){
            System.out.printf("tmps[%d] %s", i , tmps.get(i));
        }
        
    }
}

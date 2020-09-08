/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author 3z
 */
public class CompareTest {
    public static void main(String[] args){
        
        ArrayList<Shape>shapes = new ArrayList<Shape>();
        shapes.add(new Circle("C1", 3.4));
        shapes.add(new Circle("C2", 6.4));
        shapes.add(new Rectangle("R1", 5, 9));
        shapes.add(new Rectangle("R2", 4, 39));
       
        
        
        System.out.println("before sorting: "+ shapes);
        Collections.sort(shapes);
        System.out.println("after sorting: "+shapes);
        
        
        System.out.println("max shape: "+ Collections.max(shapes));
        System.out.println("min shape: "+ Collections.min(shapes));
        
        
    }
}


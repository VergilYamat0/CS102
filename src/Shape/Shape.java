/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author 3z
 */
public abstract class Shape implements Comparable<Shape> {
    
    private String name;
    
    
    public Shape (String name){
        setName(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public abstract double getArea();
    
   
    public String toString(){
        return String.format("Shape %s", name);
    }


}
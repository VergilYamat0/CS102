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
public class Circle extends TwoDShape{
    
    
    public Circle(String name, double radius){
        super(name, radius, 1);
    }

    
    public void setRadius(double radius){
        setX(radius);
    }
    
    
    public double getRadius(){
        return getX();
    }
    public double getArea(){ 
        return Math.PI * (getRadius() * getRadius());
    }
    
    public String toString(){
        return String.format("%s is a circle (%.2f)", 
                super.toString(), getRadius());
    }
      @Override
    public int compareTo(Shape shape){
        if (!(shape instanceof Circle)){
            throw new IllegalArgumentException("Shape must be Circle");
        }
        else{
            //casting
            Circle c = (Circle)shape;
            if (this.getRadius()==c.getRadius()){
                return 0;
            }else if (this.getRadius()>c.getRadius()){
                return 1;
            }else return -1;
        }
        
    }
    
}
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
public class Rectangle extends TwoDShape{
    
    public Rectangle(String name, double length, double width){
        super(name, length, width);
    }

    Rectangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getLength(){
        return getX();
    }
    
    public double getWidth(){
        return getY();
    }
    
    public void setLength(double length){
        setX(length);
    }
    
    public void setWidth(double width){
        setY(width);
    }
    public double getArea(){ // Ask Dr about formating
        return getWidth() * getLength();
    }
    
    public String toString(){
        return String.format("%s is a rectangle (%.2f, %.2f)", 
                super.toString(), getLength(), getWidth());
    }
   @Override
    public int compareTo(Shape shape){
        if (!(shape instanceof Rectangle)){
            throw new IllegalArgumentException("Shape must be Rectangle");
        }
        else{
            //casting
            Rectangle r = (Rectangle)shape;
            if (this.getLength()==r.getLength()){
                return 0;
            }else if (this.getLength()>r.getLength()){
                return 1;
            }else return -1;
        }
        
    }
}
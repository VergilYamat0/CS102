/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class Rectangle {

    // attributes || started here .. 
    private double length;
    private double width;

    public Rectangle(double le, double wid) { // constructer 
        //length = le;
        //width = wid;
        setLength(le);
        setWidth(wid);
    }

    // method 1 to calculate the area 
    public double FindArea() {
        double area = width * length;
        return area;
    }

    // method 2 to calculate the perimeter
    public double FindPeri() {
        return 2 * (length + width);
    }

    // method 3 to display the information 
    public void PrintInfo() {
        System.out.println("   The info  ");
        System.out.println("The width is: " + getWidth());
        System.out.println("The length is: " + getLength());
        System.out.println("The perimeter is: " + FindPeri());
        System.out.println("The area is: " + FindArea());
        System.out.println("");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

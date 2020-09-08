/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class Circle {

    private double PI = Math.PI;
    private double radius;

    public Circle(double PI1, double rad) {
        //PI = PI1;
        //radius = rad;
        setPi(PI1);
        setRadius(rad);
    }

    public double FindArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double FindPeri() {
        return 2 * PI * radius;
    }
    public double getPi(){
        return PI;
    }
    public double getRadius(){
        return radius;
    }
    public void setPi(double PI1){
        PI = PI1;
    }
    public void setRadius(double rad){
        radius = rad;
    }

    public void PrintInfo() {
        System.out.printf("The perimeter is: %.2f\n", FindPeri());
        System.out.printf("The area is: %.2f", FindArea());
        System.out.println("");
        System.out.println("");
    }
}

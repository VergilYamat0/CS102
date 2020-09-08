/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2_2016;

/**
 *
 * @author 3z
 */
public class Location2D {
 private double x;
 private double y;
 
 public Location2D(double x, double y){
     setX(x);
     setY(y);
 }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public String toString(){
        return String.format("X: %0.2f\n Y:%0.2f", getX(), getY());
    }
}

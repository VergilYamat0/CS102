/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.ArrayList;

/**
 *
 * @author 3z
 */
public class ShapeTest {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle("R", 10.2, 3.45);
        Circle c = new Circle("C", 2.3);

        Shape shape1 = new Circle("C3", 3.1); // polymorphism
        Shape shape2 = new Rectangle("R3", 13.2, 2.4); // polymorphism
        //polymorphism down below
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle("C5", 1.2));
        shapes.add(new Rectangle("R4", 9.2, 3.1));
        shapes.add(new Rectangle("R5", 8.3, 1.1));
        shapes.add(new Circle("C2", 1.3));

        for (Shape shape : shapes) {
            if (shape instanceof Circle) { // to check if the shape is a cirlce or not, it'll print only circles
                // to get the radius, cast the shape 
                System.out.println("Radius is: " + ((Circle) (shape)).getRadius()); // safe casting

                System.out.println(shape);
            }

        }
        System.out.println("");

        for (Shape shape : shapes) { // it'll print only rectangles, 
            //how does this loop work 
            if (shape instanceof Rectangle) {
                System.out.println("Length is: " + ((Rectangle) (shape)).getLength()); // safe casting after making sure that it's going to print
                // << only rectangls
                System.out.println(shape);
            }

        }

        System.out.println("The area of the circle: " + c.getArea()); // ask Dr about the error 
        System.out.println("The area of the rectangle: " + rect.getArea());

    }

}

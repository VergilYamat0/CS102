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
public class Factory {

    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("Circle")) {
            Circle c1 = new Circle();
            return c1;
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            Rectangle r1 = new Rectangle(); 
            return r1;
        } else {
            return null;
        }
    }
}

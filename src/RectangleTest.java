/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3.0, 2.8);
        Rectangle rect2 = new Rectangle(2.0,4.0);
        
        
        System.out.println("The length for rectangle 1 is: *before* " + rect1.getLength());
        System.out.println("The width for rectangle 1 is: *before* " + rect1.getWidth());
        System.out.println("");
        
        
        rect1.setLength(1.4);
        System.out.println("The length for rectangle 1 after changing is : " + rect1.getLength());
        
        
        rect1.setWidth(6.5);
        System.out.println("And the width after chaning is: " + rect1.getWidth());
        System.out.println("");
        
        
         rect1.PrintInfo();
        
         
         // rect2.PrintInfo(); 
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 3z
 */
public class CircleTest {

    public static void main(String[] args) {

        Circle c1 = new Circle(Math.PI, 2.1);
        Circle c2 = new Circle(Math.PI, 3.0);

        System.out.println("PI before change: " + c1.getPi()); // getting the orignal values
        System.out.println("Radius before change: " + c1.getRadius());

        c1.setPi(2.71); // changing the values
        c1.setRadius(6);
        System.out.println("");

        System.out.println("PI after change: " + c1.getPi()); // printing after changing
        System.out.println("Radius after change: " + c1.getRadius());

        //c1.PrintInfo();
        //c2.PrintInfo();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class CounterTest {

    public static void main(String[] args) {
        Student student1 = new Student("Jack", "Raiden", "0534567819", 3.2, "Hinsdale" ,new Date(2,12,1998));
        //System.out.println("Count 1: " + student1.count);
        System.out.println("Count is: " + Student.count + " student");

        Student student2 = new Student("Snake", "Eater", "0543461668", 3.9, "NewYork",new Date(1,2,1997));
        /* System.out.println("Count: " + student1.count);
        System.out.println("Count: " + student2.count); */
        System.out.println("Count2: " + Student.count + " students"); // this is way way better! 

        Student student3 = new Student("Ocelot", "Liquid", "0533456789", 1.2, "Chicago", new Date(3,11,1996));
        System.out.println("Count3: " + Student.count + " students");
    }
}

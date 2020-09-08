
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 3z
 */
public class StudentTest {

    public static void main(String[] args) {

        // declare the object
        Date bd1 = new Date(2, 12, 1998); // we can put the date like this or inside the student class
        Date bd2 = new Date(3, 10, 2001);
        Student student1 = new Student("Jack", "Raiden", "0534567819", 3.2, "Hinsdale", new Date(2, 12, 1998));// we can write as new Date or like line 19 and put the name of the varible
        Student student2 = new Student("Axl", "Rose", "0599349921", 2.01, "Los Angelos", bd2);

        student1.PrintInfo();
        student2.PrintInfo();

        System.out.println("----------------------");
        System.out.println(student1); // using the toString method after it was defined!
        System.out.println("----------------------");

        //I want to change the birth date of student 1 to 4/7/1994
        student1.setBirthDate(new Date(4, 7, 1994));
        student1.PrintInfo();
        System.out.println("");

        student2.setFirstName("Slash");

        student2.setBirthDate(new Date(5, 12, 2016)); // to change the whole class attributes values
        student2.getBirthDate().setDay(9); // to change a specif thing inside the class

        student2.PrintInfo();

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class TimeTest {

    public static void main(String[] args) {
        Time t1 = new Time(1, 25, 22);
        Time t2 = new Time(4, 20);
        Time t3 = new Time(2);
        Time t4 = new Time();

        System.out.println(t1); // print like this
        System.out.println(t2.toString()); // or like this, it's the same
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println("----------------------------");

        /*System.out.print("T1" + " ");
        System.out.print(t1.getHour() + ":");
        System.out.print(t1.getMinute() + ":");
        System.out.print(t1.getSecond());
        System.out.println("");
        
        
        System.out.print("T2" + " ");
         System.out.print(t2.getHour() + ":");
        System.out.print(t2.getMinute() + ":");
        System.out.print(t2.getSecond());
        System.out.println("");
        
        
        System.out.print("T3" + " ");
         System.out.print(t3.getHour() + ":");
        System.out.print(t3.getMinute() + ":");
        System.out.print(t3.getSecond());
        System.out.println("");
        
        System.out.print("T4" + " ");
        System.out.print(t4.getHour() + ":");
        System.out.print(t4.getMinute() + ":");
        System.out.print(t4.getSecond());
        System.out.println("");*/
        
        
        System.out.println(t1.compareTo(t2));
        System.out.println(t2.compareTo(t1));
    }
}

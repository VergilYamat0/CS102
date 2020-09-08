/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

/**
 *
 * @author 3z
 */
public class FoodTest {
    public static void main(String[] args){
        Food F = new Food("Jack", "Riyadh", 123456);
        System.out.println("You live in:54455454 " + F.getCity());
        System.out.println("Your name is: 454254 " + F.getName());
        System.out.println("Your number is 654654: "+ F.getNumber());
        
  
        
        System.out.println("-----------------------------------");
        System.out.println( F.toString());
    }
}

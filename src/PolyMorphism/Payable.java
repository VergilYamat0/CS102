/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolyMorphism;

/**
 *
 * @author 3z
 */
public interface Payable { // first interface i did 

    public abstract double getPayment();
   // public abstract String getName(); // if you didn't write the two methods in your code, you'll have an error !
    // it goes to Employee class first, then SalariedEmployee inherits the class Employee that implmented the interface with the inhertince

}

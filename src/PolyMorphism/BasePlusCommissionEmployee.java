/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolyMorphism;

import Inheritince.*;

/**
 *
 * @author 3z
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{ 
    // the word extends is inherting from the class comssionemployee 
    // we don't have to write attributes again since we inhertied it abovr ,so just the new attribute 

  

    private double baseSalary; //base salary per week // the new attribute 

    
      public BasePlusCommissionEmployee(String first, String last, 
           String ssn, double sales, double rate, 
           double bSalary){
        // create a constructor that has the same parameters to the previous class if we want to print the info with the new attribute 
       super(first, last, ssn, sales, rate);
       setBaseSalary(bSalary);
   }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0.0) { // data validation for the new attribute 
            this.baseSalary = baseSalary;
        } else {
            this.baseSalary = 0.0;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    @Override
   public double earning(){
       return baseSalary + (super.earning()); // earning in the first class does this ommissionRate * grossSales so it's better to write super.earning if it's doing the same job
   }
   
   @Override
   public String toString(){
       return String.format("base plus %s\n" // the %s refers to the toString method 
               + "base salary: %.2f",
               super.toString(), baseSalary);
   }
   
}

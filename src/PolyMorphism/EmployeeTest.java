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
public class EmployeeTest {

    public static void main(String[] args) {
        CommissionEmployee cm = new CommissionEmployee("Jack", "Vincent", "22-222-3572", 5000, 0.4);
        
        

        BasePlusCommissionEmployee bcm = new BasePlusCommissionEmployee("Jane", "Tesla", "22-222-3572", 5000, 0.8, 300);
        
        CommissionEmployee bcm2 = new BasePlusCommissionEmployee("Jane", "Tesla", "22-222-3572", 5000, 0.8, 300);
        
        System.out.println(cm);
        System.out.println("");
        System.out.println(bcm);
        System.out.println("-----------------");
        System.out.println(bcm2);
        
        System.out.println("The earning of Jane " + bcm.earning());
        System.out.println("The earning of Jack " + cm.earning());
       

            //---------------------------------------------------------------\\
         //  System.out.println("base salary: " + bcm2.getBasySalary()); // it'll not work we have to cast it from commission to base 
      
    
        // must make sure that bcm2 is BasePlusCommissionEmployee object so the casting works! 
        BasePlusCommissionEmployee bcm3 = (BasePlusCommissionEmployee) bcm2; // polymorphism 
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Base salary: " + bcm3.getBaseSalary());  

    }
}

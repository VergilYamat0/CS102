/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritince;

/**
 *
 * @author 3z
 */
public class EmployeeTest {

    public static void main(String[] args) {
        CommissionEmployee cm = new CommissionEmployee("Jack", "Vincent", "22-222-3572", 5000, 0.4);

        BasePlusCommissionEmployee bcm = new BasePlusCommissionEmployee("Jane", "Tesla", "22-222-3572", 5000, 0.8, 300);
        
        System.out.println(cm);
        System.out.println("");
        System.out.println(bcm);
        System.out.println("");
        
        System.out.println("The earning of Jane " + bcm.earning());
        System.out.println("The earning of Jack " + cm.earning());
    }
}

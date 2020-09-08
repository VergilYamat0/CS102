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
public abstract class SalariedEmployee extends Employee { // extends employee which he has already implented the interface payable

    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        setWeeklySalary(salary);
    }
    
    public void setWeeklySalary(double salary) {
        if (salary >= 0.0) {
            weeklySalary = salary;
        } else {
            weeklySalary = 0.0;
        }
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double getPayment() {
        return getWeeklySalary();
    }
    
    @Override
    public String toString() {
        return String.format("salaried employee: %s weekly salary: %.2f \n\n",
                super.toString(), getWeeklySalary());
    }

}

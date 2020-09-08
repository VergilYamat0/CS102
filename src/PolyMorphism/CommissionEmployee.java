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
public class CommissionEmployee {

    protected String firstName; // protected is between public & private, you can access it inside sub classes unlike private 
    private String lastName;
    private String Ssn;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        setFirstName(first);
        setLastName(last);
        setSsn(ssn);
        setGrossSales(sales); //we have to perform data validation
        setCommissionRate(rate);//we have to perform data validation
    }
    public CommissionEmployee(){
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String ssn) {
        Ssn = ssn;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double sales) {
        if (sales >= 0.0)//data validation
        {
            grossSales = sales;
        } else {
            throw new IllegalArgumentException("Gross sales must be greater than 0.0");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double rate) {
        if ((rate >= 0.0) && (rate < 1.0)) {
            commissionRate = rate;
        } else {
            throw new IllegalArgumentException("Commission rate must in >=0.0 and <1.0");
        }
    }

    public double earning() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("commission employee: %s %s\n"
                + "social security number: %s \n"
                + "gross sales: %.2f \n"
                + "commission rate: %.2f", firstName, lastName, Ssn,
                grossSales, commissionRate);
    }

}

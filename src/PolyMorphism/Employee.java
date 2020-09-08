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
public abstract class Employee implements Payable{

    private String firstName;
    private String lastName;
    private String Ssn;

    public Employee(String first, String last, String ssn) {
        setFirstName(first);
        setLastName(last);
        setSsn(ssn);
    }
   /*public double getPayment(){
        return 0.0;
    }
    public String getName(){ /// you must write the interface methods if you are not going to write abstract in line 11
        return "Meow";
    }*/
   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String ssn) {
        this.Ssn = ssn;
    }
    
    
    @Override
    public String toString() {
        return String.format("employee: %s %s\n"
                + "social security number: %s \n",
                firstName, lastName, Ssn);
    }

}

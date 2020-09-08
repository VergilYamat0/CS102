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
public class DataBase {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public DataBase(String firstName, String lastName, String phoneNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public void setPhoneNumber(String pn) {
       
            this.phoneNumber = pn;
        
    }

    public String toString() {
        return String.format(""
                + "First name: %s\n"
                + "Last name: %s\n"
                + "Phone numbner: %s\n", getFirstName(), getLastName(), getPhoneNumber());
    }
}

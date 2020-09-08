/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2014;

/**
 *
 * @author 3z
 */
public class Patient {

    private String name;
    private Address address;
    private String ID;
    private String mobilePhone;
    
    public Patient(String name, Address address, String ID, String mobilePhone){
        setName(name);
        setAddress(address);
        setId(ID);
        setMobilePhone(mobilePhone);
    } // full argument con ^^ 
    public Patient(){ // default con
        
    }
    public Patient(Patient p){ // copy con, ask Dr 
        this(p.getName(), p.getAddress(), p.getId(), p.getMobilePhone());
    }


    public String getName() { // don't forget to check the class again for errors
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getId() {
        return ID;
    }

    public void setId(String ID) {
        if (ID.length() == 6) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Wrong ID number");
        }
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        if ((mobilePhone.startsWith("05")) && (mobilePhone.length() == 10)) {
            this.mobilePhone = mobilePhone;
        } else {
            throw new IllegalArgumentException("Wrong mobile number");
        }
    }

    public String toString() {
        return String.format("[%s]: %s, %s, {%s}", ID, name, mobilePhone, address);
    }

}

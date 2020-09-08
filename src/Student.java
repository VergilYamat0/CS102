/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class Student {

    // started with this
    private String firstName; // we write private to hide the data 
    private String lastName;
    private String phone;
    private double gpa;
    private String address;
    private Date birthDate; // class date inside the class student! ** it's encapsulated!! new!!! 

    public static int count; // to count how many students

    public Student(String firstName, String lastName, String phone, double gpa, String address, Date bd) { // constructer
        setFirstName(firstName); // this is safer instead of doing the one above it 
        setLastName(lastName);
        setPhone(phone);
        setGpa(gpa);
        setAddress(address);
        setBirthDate(bd); ////////////// new 
        count++;
    }

    public Student() {
        count++; // to keep track of the number of students ** 
    }

    // reading the phone attribute
    public String getPhone() { // to print the orignal value of the value\ attribute
        return phone;
    }

    // reading the first name attribute
    public String getFirstName() {
        return firstName;
    }

    // reading the last name attribute
    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public String getAddress() {
        return address;
    }

    // changing the attribute to whatever you want!
    public void setPhone(String phone) { // to change the value of the value\ attribute ** ph is just a parameter. 
        if (phone.startsWith("05") && (phone.length() == 10)) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone number is not valid");
        }
    }

    // changing the attribute to whatever you want!
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
// changing the attribute to whatever you want!

    public void setLastName(String lastName) {
        this.lastName = lastName; // (this) is a word to tell what's the attribute from the method parameter! 
    }
// changing the attribute to whatever you want!

    public void setGpa(double GPA) {
        if ((GPA >= 0.0) && (GPA <= 4.0)) {
            gpa = GPA;
        } else {
            throw new IllegalArgumentException("Wrong gpa");
        }
    }
// changing the attribute to whatever you want!

    public void setAddress(String address) {
        this.address = address;
    }
// printing the information to the user! 

    public void PrintInfo() {
        System.out.println("   Student Info ");
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Phone number: " + getPhone());
        System.out.println("GPA: " + getGpa());
        System.out.println("Address: " + getAddress());
        System.out.println("Date of birth: " + getBirthDate());
        System.out.println("Day of birth: " + getBirthDate().getDay());
        System.out.println("Month of birth: " + getBirthDate().getMonth());
        System.out.println("Year of birth: " + getBirthDate().getYear());
        System.out.println("");

    }

    public Date getBirthDate() {
        return birthDate;
    }
// changing the attribute to whatever you want!

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
// printing without using PrintInfo method! 

    public String toString() {
        return String.format("%s %s : [%s]\n with gpa of %.2f\n and lives at %s", firstName, lastName, phone, gpa, address);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Patterns;

/**
 *
 * @author 3z
 */
public class University {
    
    
    private String name;
    private String address;
    
   
    //Early 
    private static University instance=  null; // Design Pattern: Singelton 
    
    private University(String name, String address) { // it's important to use private in Singelton pattern
        this.name = name;
        this.address = address;
      
    }
    // Lazy
    public static University CreateUniversity(){ // Singelton pattern 
        if (instance == null)
            instance = new University("Prince Sultan University", "Rafha Street");
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" + "name=" + name + ", address=" + address + '}';
    }
    
    
    
}

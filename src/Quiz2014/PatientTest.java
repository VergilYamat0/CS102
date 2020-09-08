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
public class PatientTest {
    public static void main(String[] args){
        Patient[] array = new Patient[3]; // how can i save lines 
         
        array[0] = new Patient("Ali Hassan", new Address("King Abdullah Road", "Riyadh", "Saudi Arabia"), "124521", "0507454124");
        array[1] = new Patient("Salem Al-Salem", new Address("King Khaled Road", "Jeddah", "Saudi Arabia"), "354624", "0524798621");
        array[2] = new Patient();
        
        array[2].setName("Mounir Hamdi");
        array[2].setId("541874");
        array[2].setMobilePhone("0514214541");
        array[2].setAddress(new Address("King Faisal Street", "Makkah", "Saudi Arabia"));
        
        for(int i =0; i < array.length; i++){
            System.out.println(array[i] + "\n");
        }
        
        
    }
}

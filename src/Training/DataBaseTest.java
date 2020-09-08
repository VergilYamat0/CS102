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
public class DataBaseTest {
    public static void main(String[] args){
        SubDateBase Client1 = new SubDateBase("Jack", "Vincent","0599349921", "Riyadh", 1234567899);
        Client1.getCityName();
        System.out.println(Client1.toString());
        System.out.println("--------------------------------");
        Client1.setCityName("Jeddah");
        Client1.setFirstName("Joe");
        Client1.setLastName("Escobar");
        System.out.println(Client1.toString());
    }
}

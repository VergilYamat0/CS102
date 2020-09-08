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
public class UniversityTest {

    public static void main(String[] args) {
        University university = University.CreateUniversity(); 
       
        
        University univeristy2 = University.CreateUniversity();
        System.out.print("Getting the name: ");
        System.out.println(univeristy2.getName());
      /*  System.out.print("Address: ");
        System.out.println(univeristy2.getAddress());*/
        
        
        University university3 = University.CreateUniversity();
            System.out.print("Getting the name: ");
        System.out.println(university3.getName());
        
        System.out.println("");
        System.out.println("Testing..");
        System.out.println("");
        System.out.println(university.getName());
        university.setName("ASU");
        univeristy2.setName("MIT");
        System.out.println(univeristy2.getName());
        university3.setName("KSU");
        System.out.println(university3.getName());
    }
}

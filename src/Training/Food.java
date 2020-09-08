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
public class Food {
    private String Name;
    private String City;
    private int Number;
    
    public Food(String Name, String City, int Number){
        setName(Name);
        setCity(City);
        setNumber(Number);
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getCity(){
        return City;
    }
    public void setCity(String City){
        if (City.startsWith("R") && (City.length() > 2)) {
            this.City = City;
        }else{
            throw new IllegalArgumentException("Shit city");
        }
        
    }

    
    public int getNumber(){
        return Number;
    }
    public void setNumber(int Number){
        this.Number = Number;
    }
    
    
    public String toString(){
        return String.format("Your name is: %s \n You live in: %s \n Your numebr is: %d", getName(), getCity(), getNumber());
    }
    
   
    
}

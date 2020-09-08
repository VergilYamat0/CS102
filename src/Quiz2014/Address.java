package Quiz2014;

import Quiz01_2016.*;
import previous.quiz01.fall2016.Street;

public class Address {
    private String StreetName;
    private String City;
    private String Country;
    
    public Address (String sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }

    public Address(Street st1, String riyadh_, String saud_Arabia, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Address(Street st1, String riyadh_, String saud_Arabia, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void SetAddress (String sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }
    
    public String getStreetName(){
        return StreetName;
    }
    
    public String getCity(){
        return City;
    }
    
    public String getCountry(){
        return Country;
    }
    
    public String toString(){
        return String.format("%s ,%s, %s", this.getStreetName(), this.getCity(), this.getCountry());
    }
    
}

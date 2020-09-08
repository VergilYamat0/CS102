/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2_2016;

/**
 *
 * @author 3z
 */
public class City {

    private String name;
    private GPS location;
    private String country;

    public City(String name, GPS location, String country) {
        setName(name);
        setLocation(location);        
        setCountry(country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GPS getLocation() {
        return location;
    }

    public void setLocation(GPS location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String toString(){
        return String.format("%s\n %s\n (%s)", name, country, location);
    }
}

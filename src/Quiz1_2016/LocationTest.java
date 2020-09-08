
package previous.quiz01.fall2016;

import java.util.ArrayList;


public class LocationTest {
    
    public static void main(String []args){
        
        ArrayList<Location>locations = new ArrayList<Location>();
        
        Street street1 = new Street(1, "Abubark Road", "Morsalat");
        Address address1 = new Address(street1, "Riyadh", "Saudi Arabia");
        Geolocation geo1 = new Geolocation(24.7136, 46.6753, 612.0);
        
        Location location1 = new Location(address1, geo1, 1, "Riyadh");
        
        locations.add(location1);
        
        
        locations.add(new Location(new Address(new Street(2, "Nassria Street","Sfax Jadida"), "Sfax", "Tunisia"), new Geolocation(34.7478, 10.7662, 20.0), 1, "Sfax"));
        
        
        locations.get(1).getGeolocation().setAltitude(10.2);
        
        locations.get(0).getAddress().getStreetName().setNumber(15);
        
        for (Location l : locations){
            System.out.printf("%s: lat=%.4f/lon=%.4f/atl=%.4f\n", 
                    l.getName(), l.getGeolocation().getLatitude(),
                    l.getGeolocation().getLongitude(),
                    l.getGeolocation().getAltitude());
        }
        
        double lowest = 99999;
        
        for (int i=0;i<locations.size();i++){
            if (lowest>locations.get(i).getGeolocation().getAltitude())
                lowest = locations.get(i).getGeolocation().getAltitude();
        }
        
        System.out.println("lowest location is: "+ lowest);
        
    }
    
    
}

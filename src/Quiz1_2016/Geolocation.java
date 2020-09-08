
package previous.quiz01.fall2016;


public class Geolocation {
    
    private double latitude;
    private double longitude;
    private double altitude;
    
    
    public Geolocation (double lat, double lng, double alt){
        setLatitude(lat);
        setLongitude(lng);
        setAltitude(alt);
    }
    
    public Geolocation(){
        this(0,0,0);
    }
    
    public Geolocation (Geolocation geo){
        this(geo.latitude,geo.longitude,geo.altitude);
    }
    
    
    
    public void setLatitude(double lat){
        if ((lat>-85)&&(lat<85)){
            latitude = lat;
        }else throw new IllegalArgumentException("wrong altitude");
    }
    
    public void setLongitude(double lng){
        if ((lng>-180)&&(lng<180)){
            longitude = lng;
        }else throw new IllegalArgumentException("wrong longitude");
    }
    
    public void setAltitude(double alt){
        this.altitude = alt;
    }
    
    
    public double getLatitude(){
        return latitude;
    }
    
    public double getLongitude(){
        return longitude;
    }
    
    public double getAltitude(){
        return altitude;
    }
    
    public String toString(){
        return String.format("lat: %.4f, lon: %.4f, alt: %.4f",
                this.latitude, this.longitude,this.altitude);
    }
    
}

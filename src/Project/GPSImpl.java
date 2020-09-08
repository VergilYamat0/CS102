package Project;

public class GPSImpl implements GPS{

    private double lat;
    private double lon;
    private double altitude;

    @Override
    public double getLat() {
        return lat;
    }

    public GPSImpl(double lat, double lon, double altitude) {
        this.lat = lat;
        this.lon = lon;
        this.altitude = altitude;
    }

    @Override
    public double getLon() {
        return lon;
    }

    @Override
    public double getAlt() {
        return altitude;
    }

    @Override
    public void setLat(double latitude) {
        this.lat = lat;
    }

    @Override
    public void setLon(double longitude) {
        this.lon = lon;
    }

    @Override
    public void setAlt(double altitude) {
        this.altitude = altitude;
    }
   
    
        
    
}

package previous.quiz01.fall2016;


public class Location {
    
    private Address address;
    private Geolocation geolocation;
    private int id;
    private String name;
    
    public Location(Address address,
            Geolocation geolocation,
            int id,
            String name){
        setAddress(address);
        setGeolocation(geolocation);
        setId(id);
        setName(name);
    }
    
    public Location (Location location){
        this(location.address, location.geolocation,
                location.id, location.name);
    }
    
    public Location(){
        
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public void setGeolocation(Geolocation geolocation){
        this.geolocation=geolocation;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Address getAddress(){
        return address;
    }
    
    public Geolocation getGeolocation(){
        return geolocation;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return String.format("[%d] %s %s %s", id, name, address, geolocation);
    }
        
    
}

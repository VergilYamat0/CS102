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
public class GPS extends Location3D{

    public GPS(double lat, double lng, double alt){
        super(lat,lng,alt);
        
    }
    public double getLat(){
        return getX();
    }
    public double getLon(){
        return getY();
    }
    public void setLat(double Lat){
      if((Lat > -185) && (Lat < 185)){
           setX(Lat); 
      }
      else
          throw new IllegalArgumentException("Wrong latitude");
    }
    public void setLon(double Lon){
        setY(Lon);
    
    }
    public double getAlt(){
        return getZ();
    }
    public void setAlt(double Alt){
        setZ(Alt);
    }
    public String toString(){
        return String.format("%s", super.toString());
    }
    
}

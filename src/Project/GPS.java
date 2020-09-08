/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author 3z
 */
public interface GPS {
    public abstract double getLat();
    public abstract double getLon();
    public abstract double getAlt();
    public void setLat(double latitude);
    public void setLon(double longitude);
    public void setAlt(double altitude);
    
    
}

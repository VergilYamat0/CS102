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
public class Location3D extends Location2D{
    private double z;

    public Location3D(double x, double y, double z){
        super(x,y);
        setZ(z);
        
    }
    
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public String toString(){
        return String.format("%s\n Z: %0.2f", super.toString(), getZ());
    }
  
}

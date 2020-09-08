/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Major01_2017_Interfaces;

/**
 *
 * @author 3z
 */
public interface Image extends Comparable<Image>{
    public abstract int getWidth();
    public abstract int getLength();
    public abstract String getName();
    public abstract Pixel[][] getImg();
    
    
    public abstract void setWidth(int width);
    public abstract void setLength(int length);
    public abstract void setName(String name);
    
    public abstract void randomize();
}
